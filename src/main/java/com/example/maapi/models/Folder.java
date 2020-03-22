package com.example.maapi.models;

import com.example.maapi.models.bridges.FolderLabel;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @OneToMany(mappedBy = "folder")
    private List<Note> notes;

    @OneToMany(mappedBy = "folderlabel")
    private List<FolderLabel> labels;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<FolderLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<FolderLabel> labels) {
        this.labels = labels;
    }
}
