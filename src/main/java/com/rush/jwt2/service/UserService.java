package com.rush.jwt2.service;

import com.rush.jwt2.entity.User;
import com.rush.jwt2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User addUser(User user){
        return userRepo.save(user);
    }
}
