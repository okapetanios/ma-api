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
    private Note notelabel;

    @ManyToOne
    @JsonIgnore
    private Label labelnote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Note getNotelabel() {
        return notelabel;
    }

    public void setNotelabel(Note notelabel) {
        this.notelabel = notelabel;
    }

    public Label getLabelnote() {
        return labelnote;
    }

    public void setLabelnote(Label labelnote) {
        this.labelnote = labelnote;
    }
}
