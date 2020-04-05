package com.example.maapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String note;
    private String title;
    private String status = "private";

    @ManyToOne
    @JsonIgnore
    private User user;

    @ManyToOne
    @JsonIgnore
    private Folder folder;
//
//    @OneToMany(mappedBy = "notelabel")
//    private List<NoteLabel> labels;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Folder getFolder() {
        return folder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

//    public List<NoteLabel> getLabels() {
//        return labels;
//    }
//
//    public void setLabels(List<NoteLabel> labels) {
//        this.labels = labels;
//    }

    public boolean equals(Note other){
        boolean result = true;
        if(this.id == other.id){
            result = result && true;
        }
        if(this.note.equals(other.note)){
            result = result && true;
        }
        if(this.title.equals(other.title)){
            result = result && true;
        }
        if(this.status.equals(other.status)){
            result = result && true;
        }
        if(this.getUser().equals(other.getUser())){
            result = result && true;
        }
        if(this.getFolder().equals(other.getFolder())){
            result = result && true;
        }
        return  result;
    }
}
