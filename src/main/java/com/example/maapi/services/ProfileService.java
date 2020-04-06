package com.example.maapi.services;

import com.example.maapi.models.Note;
import com.example.maapi.models.Profile;
import com.example.maapi.models.User;
import com.example.maapi.repositories.ProfileRepo;
import com.example.maapi.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRepo profileRepo;
    @Autowired
    UserRepo userRepo;

    public List<Profile> findAllProfiles(){
        return profileRepo.findAllProfiles();
    }

    public Profile findProfileByUser(int userId){
        return profileRepo.findProfileByUser(userId);
    }

    public Profile createProfileForUser(int userId, Profile profile){
        User user = userRepo.findUserById(userId);
        profile.setUser(user);
        return profileRepo.save(profile);
    }

    public int updateProfile(int userId, Profile updatedProfile){
        User user = userRepo.findUserById(userId);
        updatedProfile.setUser(user);
        profileRepo.save(updatedProfile);
        Profile profile = profileRepo.findProfileByUser(userId);
        if(updatedProfile.equals(profile)){
            return 1;
        } else {
            return 0;
        }
    }
}
