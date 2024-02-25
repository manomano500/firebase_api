package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
    private final UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registerUser(UserDto userDto) {
        User user = new User();
        try{
            user.setUsername(userDto.getUsername());
            user.setPassword(userDto.getPassword());
            user.setEmail(userDto.getEmail());
            userRepository.save(user);
            return true;
    
        } catch (Exception e) {
            // If there's an exception (e.g., database error), return false
            return false;
        }
      
    }

    // public User loginUser(String username, String password) {
    //     User user = userRepository.findByUsername(username);
    //     if (user != null && user.getPassword().equals(password)) {
    //         return user;
    //     }
    //     return null;
    // }


    
    public List<User> getAllUsers() {
       return userRepository.findAll();
        }

        public boolean loginUser(String username, String password) {
            // Retrieve the user from the database or any other data source based on the username
            User user = userRepository.findByUsername(username);
        
            // Check if the user exists and the provided password matches the stored password
            if (user != null && user.getPassword().equals(password)) {
                // Authentication successful
                return true;
            } else {
                // Authentication failed
                return false;
            }
        }
}