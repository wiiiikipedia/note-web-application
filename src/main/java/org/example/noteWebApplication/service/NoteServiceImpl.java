package org.example.noteWebApplication.service;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.db.repository.NoteRepository;
import org.example.noteWebApplication.service.crud.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl
    extends AbstractCrudService<Note, Long>
    implements NoteService {

    NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(JpaRepository<Note, Long> jpaRepository, NoteRepository noteRepository) {
        super(jpaRepository);
        this.noteRepository = noteRepository;
    }
}
