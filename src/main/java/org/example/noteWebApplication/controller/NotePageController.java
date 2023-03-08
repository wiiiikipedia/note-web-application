package org.example.noteWebApplication.controller;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.service.NoteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NotePageController {

    private final NoteServiceImpl noteService;

    public NotePageController(
            NoteServiceImpl noteService
    ) {
        this.noteService = noteService;
    }

    @GetMapping("/notes")
    public ModelAndView ShowPage(
    ){
        List<Note> notes = noteService.findAll();

        return new ModelAndView("notePage")
                .addObject("notes", notes);
    }
}
