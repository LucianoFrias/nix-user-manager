package com.usermanagementsystem.usermanagementsystem.services;

import com.usermanagementsystem.usermanagementsystem.entities.User;
import com.usermanagementsystem.usermanagementsystem.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user)
    {
        return userRepository.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(Long id)
    {
        return userRepository.findById(id);
    }

    public User updateUser(User user, Long id)
    {
        Optional<User> existingUser = this.getUserById(id);
        existingUser.get().setName(user.getName());
        existingUser.get().setSurname(user.getSurname());
        existingUser.get().setGender(user.getGender());
        existingUser.get().setPassword(user.getPassword());
        existingUser.get().setRole(user.getRole());
        existingUser.get().setEmail(user.getEmail());


        return userRepository.save(existingUser.get());
    }

    public void deleteUserById(Long id)
    {
        userRepository.deleteById(id);
    }

}
