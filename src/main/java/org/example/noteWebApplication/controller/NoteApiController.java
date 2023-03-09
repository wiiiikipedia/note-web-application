package org.example.noteWebApplication.controller;

import jakarta.validation.Valid;
import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.form.NoteForm;
import org.example.noteWebApplication.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
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
            @ModelAttribute("noteForm") @Valid NoteForm note,
            BindingResult bindingResult,
            Model model
    ) {

        if(bindingResult.hasErrors()) {
            model.addAttribute("notes", noteService.findAll());
            model.addAttribute("editSuccess", "Поля не могут быть пустыми!");
            return "index";
        }

        noteService.save(new Note()
                            .setNoteHeader(note.getNoteHeader())
                            .setNoteBody(note.getNoteBody())
                            .setCreatedAt(LocalDate.now())
                            .setEditedAt(LocalDate.now()));

        model.addAttribute("notes", noteService.findAll());
        model.addAttribute("createSuccess", "Заметка успешно создана");

        return "index";
    }

    @DeleteMapping
    @RequestMapping("/{id}/delete")
    public String deleteNote(
            @PathVariable Long id,
            Model model
    ) {
        noteService.deleteById(id);

        model.addAttribute("notes", noteService.findAll());
        model.addAttribute("deleteSuccess", "Заметка успешно удалена");

        return "index";
    }

    @PutMapping
    @RequestMapping("/{id}/edit")
    public String editNote(
            @PathVariable Long id,
            @ModelAttribute("editNoteForm") @Valid NoteForm note,
            BindingResult bindingResult,
            Model model
    ) {

        if(bindingResult.hasErrors()) {
            model.addAttribute("editSuccess", "Поля не могут быть пустыми!");
            return "index";
        }

        Note updateNote = noteService.getById(id);

        updateNote.setNoteHeader(note.getNoteHeader());
        updateNote.setNoteBody(note.getNoteBody());
        updateNote.setEditedAt(LocalDate.now());

        noteService.save(updateNote);

        model.addAttribute("notes", noteService.findAll());
        model.addAttribute("editSuccess", "Заметка успешно обновлена");

        return "index";
    }
}
