package com.example.maapi.repositories;

import com.example.maapi.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    @Query("select user from User user")
    public List<User> findAllUsers();

    @Query("select user from User user where user.id=:uid")
    public User findUserById(@Param("uid") int userId);

    @Query("select user from User user where user.username=:username and user.password=:password")
    public User findUserByCredentials(
            @Param("username") String username,
            @Param("password") String password);
}
