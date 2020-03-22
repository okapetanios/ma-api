package com.example.maapi.models;

import com.example.maapi.models.bridges.FolderLabel;
import com.example.maapi.models.bridges.NoteLabel;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "labels")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @OneToMany(mappedBy = "labelfolder")
    private List<FolderLabel> folders;

    @OneToMany(mappedBy = "labelnote")
    private List<NoteLabel> notes;

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

    public List<FolderLabel> getFolders() {
        return folders;
    }

    public void setFolders(List<FolderLabel> folders) {
        this.folders = folders;
    }

    public List<NoteLabel> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteLabel> notes) {
        this.notes = notes;
    }
}