package org.example.noteWebApplication.controller;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/notes")
public class NoteApiController {

    NoteService noteService;

    @Autowired
    public NoteApiController(NoteService noteService) {
        this.noteService = noteService;
    }


    @PostMapping
    @RequestMapping("/create")
    public String createNote (
            @ModelAttribute("noteForm") Note note
    ) {
        noteService.save(new Note()
                            .setNoteHeader(note.getNoteHeader())
                            .setNoteBody(note.getNoteBody())
                            .setCreatedAt(LocalDate.now())
                            .setEditedAt(LocalDate.now()));

        return "index";
    }

    @DeleteMapping
    @RequestMapping("/{id}/delete")
    public String deleteNote(
            @PathVariable Long id
    ) {
        noteService.deleteById(id);
        return "заметка удалена";
    }

    @PutMapping
    @RequestMapping("/{id}/edit")
    public String editNote(
            @PathVariable Long id,
            @ModelAttribute("editNoteForm") Note note
    ) {

        Note updateNote = noteService.getById(id);

        updateNote.setNoteHeader(note.getNoteHeader());
        updateNote.setNoteBody(note.getNoteBody());
        updateNote.setEditedAt(LocalDate.now());

        noteService.save(updateNote);

        return "заметка обновлена";
    }
}
