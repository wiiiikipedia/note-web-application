package org.example.noteWebApplication.controller;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.service.NoteServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class NotePageController {

    private final NoteServiceImpl noteService;

    public NotePageController(
            NoteServiceImpl noteService
    ) {
        this.noteService = noteService;
    }

    @GetMapping("/notes/{id}")
    public ModelAndView ShowPage(
            @PathVariable Long id
    ){
        Note noteFromDatabase = noteService.getById(id);

        return new ModelAndView("notePage")
                .addObject("noteFromDatabase", noteFromDatabase);
    }
}
