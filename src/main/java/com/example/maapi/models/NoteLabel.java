package com.example.maapi.models;

import com.example.maapi.models.Label;
import com.example.maapi.models.Note;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "notelabels")
public class NoteLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonIgnore
    private Note note;

    @ManyToOne
    @JsonIgnore
    private Label label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
