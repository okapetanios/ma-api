package com.example.maapi.models.bridges;

import com.example.maapi.models.Folder;
import com.example.maapi.models.Label;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "folderlabels")
public class FolderLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonIgnore
    private Folder folderlabel;

    @ManyToOne
    @JsonIgnore
    private Label labelfolder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Folder getFolderlabel() {
        return folderlabel;
    }

    public void setFolderlabel(Folder folderlabel) {
        this.folderlabel = folderlabel;
    }

    public Label getLabelfolder() {
        return labelfolder;
    }

    public void setLabelfolder(Label labelfolder) {
        this.labelfolder = labelfolder;
    }
}
