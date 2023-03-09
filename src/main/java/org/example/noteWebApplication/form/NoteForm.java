package org.example.noteWebApplication.form;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class NoteForm {
    private Long id;
    @NotBlank
    private String noteHeader;
    @NotBlank
    private String noteBody;
    private LocalDate createdAt;
    private LocalDate editedAt;

    public Long getId() {
        return id;
    }

    
    public String getNoteHeader() {
        return noteHeader;
    }

    public NoteForm setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
        return this;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public NoteForm setNoteBody(String noteBody) {
        this.noteBody = noteBody;
        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public NoteForm setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDate getEditedAt() {
        return editedAt;
    }

    public NoteForm setEditedAt(LocalDate editedAt) {
        this.editedAt = editedAt;
        return this;
    }
}
