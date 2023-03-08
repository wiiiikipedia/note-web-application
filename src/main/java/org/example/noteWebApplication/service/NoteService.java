package org.example.noteWebApplication.service;

import org.example.noteWebApplication.db.entity.Note;
import org.example.noteWebApplication.service.crud.CrudService;

public interface NoteService extends CrudService<Note, Long> {
}
