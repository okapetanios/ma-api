package com.example.maapi.controllers;

import com.example.maapi.models.User;
import org.springframework.web.bind.annotation.*;
import com.example.maapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/api/users")
    public List<User> findAllUsers(){
        return service.findAllUsers();
    }

    @GetMapping("/api/users/{uid}")
    public User findUserById(@PathVariable("uid") int userId){
        return service.findUserById(userId);
    }

    @PostMapping("/api/users")
    public User createUser(@RequestBody User newUser){
        return service.createUser(newUser);
    }

    @PutMapping("/api/users/{uid}")
    public int updateCourse(@PathVariable("uid") int userId, @RequestBody User updated){
        return service.updateUser(userId, updated);
    }

    @DeleteMapping("/api/users/{uid}")
    public int deleteCourse(@PathVariable("uid") int userId){
        return service.deleteUser(userId);
    }
}
