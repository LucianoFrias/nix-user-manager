package com.usermanagementsystem.usermanagementsystem.controllers;

import com.usermanagementsystem.usermanagementsystem.entities.User;
import com.usermanagementsystem.usermanagementsystem.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id)
    {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers()
    {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id)
    {
        return new ResponseEntity<>(userService.updateUser(user, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long id)
    {
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
