package com.example.maapi.services;

import com.example.maapi.models.Profile;
import com.example.maapi.repositories.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRepo profileRepo;

    public List<Profile> findAllProfiles(){
        return profileRepo.findAllProfiles();
    }

    public Profile findProfileByUser(int userId){
        return profileRepo.findProfileByUser(userId);
    }
}
