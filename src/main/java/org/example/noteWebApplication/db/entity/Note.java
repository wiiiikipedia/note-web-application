package org.example.noteWebApplication.db.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="note_body")
    private String noteBody;
    private LocalDate createdAt;
    private LocalDate editedAt;
    @Column(name="note_header")
    private String noteHeader;


    public Long getId() {
        return id;
    }


    public String getNoteBody() {
        return noteBody;
    }

    public Note setNoteBody(String noteBody) {
        this.noteBody = noteBody;
        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Note setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getNoteHeader() {
        return noteHeader;
    }

    public Note setNoteHeader(String noteHeader) {
        this.noteHeader = noteHeader;
        return this;
    }

    public LocalDate getEditedAt() {
        return editedAt;
    }

    public Note setEditedAt(LocalDate editedAt) {
        this.editedAt = editedAt;
        return this;
    }
}
