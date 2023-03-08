package org.example.noteWebApplication.db.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="note_body")
    private String noteBody;
    private Date created_at;

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

    public Date getCreated_at() {
        return created_at;
    }

    public Note setCreated_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }
}
