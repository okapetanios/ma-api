package com.example.maapi.repositories;

import com.example.maapi.models.Note;
import com.example.maapi.models.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileRepo extends CrudRepository<Profile, Integer> {
    @Query("select profile from Profile profile")
    public List<Profile> findAllProfiles();

    @Query("select profile from Profile profile where profile.user.id=:uid")
    public Profile findProfileByUser(@Param("uid") int userId);
}
