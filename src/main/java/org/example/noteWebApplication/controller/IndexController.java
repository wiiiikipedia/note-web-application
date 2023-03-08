package org.example.noteWebApplication.controller;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    private final NoteServiceImpl noteService;

    @Autowired
    public IndexController(
            NoteServiceImpl noteService
    ) {
        this.noteService = noteService;
    }

    @GetMapping("/")
    public ModelAndView ShowPage( ){
        List<Note> notes = noteService.findAll();

        return new ModelAndView("index")
                .addObject("notes", notes);
    }
}
