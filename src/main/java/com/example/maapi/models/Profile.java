package com.example.maapi.models;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile extends User {
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
