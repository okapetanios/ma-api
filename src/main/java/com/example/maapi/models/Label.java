package com.example.maapi.models;

import com.example.maapi.models.bridges.FolderLabel;
import com.example.maapi.models.bridges.NoteLabel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "labels")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String status = "private";

    @ManyToOne
    @JsonIgnore
    private User user;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
