package com.example.maapi.controllers;

import com.example.maapi.models.Profile;
import com.example.maapi.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {
    @Autowired
    ProfileService service;

    @GetMapping("/api/profiles")
    public List<Profile> findAllProfiles(){
        return service.findAllProfiles();
    }

    @GetMapping("/api/users/{uid}/profiles")
    public Profile findProfileByUser(@PathVariable("uid") int userId){
        return service.findProfileByUser(userId);
    }
}
