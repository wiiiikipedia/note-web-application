package org.example.noteWebApplication.controller;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.db.repository.NoteRepository;
import org.example.noteWebApplication.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
                            .setCreated_at(new Date()));

        return "заметка добавлена";
    }

    @DeleteMapping
    @RequestMapping("/delete/{id}")
    public String deleteNote(
            @PathVariable Long id
    ) {
        noteService.deleteById(id);
        return "заметка удалена";
    }
}
