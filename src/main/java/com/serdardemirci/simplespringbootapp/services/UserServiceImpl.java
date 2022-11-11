package com.serdardemirci.simplespringbootapp.services;

import com.serdardemirci.simplespringbootapp.entities.AppUser;
import com.serdardemirci.simplespringbootapp.entities.Course;
import com.serdardemirci.simplespringbootapp.repositories.InMemory;
import com.serdardemirci.simplespringbootapp.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;


   public List<AppUser> getUsers() {
        return this.userRepository.findAll();
    }

    public AppUser createUser(@Valid AppUser user) {
        return this.userRepository.save(user);
    }

    public AppUser getUserByUserName(String username) {
        return this.userRepository.getUserByUserName(username);
    }

    public void deleteUserByUuid(Long id) {
        this.userRepository.deleteById(id);
    }
}
