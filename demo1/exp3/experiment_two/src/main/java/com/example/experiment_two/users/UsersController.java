package com.example.experiment_two.users;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 *
 * @author Sihoon Lee
 */

@RestController
public class UsersController {
    HashMap<String, User> usersList = new  HashMap<>();


    @GetMapping("/user")
    public  HashMap<String,User> getAllUsers() {
        return usersList;
    }

    @PostMapping("/user")
    public  String createUser(@RequestBody User user) {
        System.out.println(user);
        usersList.put(user.getId(), user);
        return "************** New user "+ user.getId() + " Saved **************";
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id) {
        User u = usersList.get(id);
        return u;
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User p) {
        usersList.replace(id, p);
        return usersList.get(id);
    }

    @DeleteMapping("/user/{id}")
    public HashMap<String, User> deleteUser(@PathVariable String id) {
        usersList.remove(id);
        return usersList;
    }
}

