package com.serdardemirci.simplespringbootapp.controllers;

import com.serdardemirci.simplespringbootapp.dtos.UserDto;
import com.serdardemirci.simplespringbootapp.entities.AppUser;
import com.serdardemirci.simplespringbootapp.services.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserServiceImpl userService;

    public UsersController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        List<UserDto> userRecords = this.userService.getUsers().stream()
                .map(x -> {
                    UserDto userDto = new UserDto();
                    userDto.setName(x.getUserName());
                    return userDto;
                })
                .toList();
        //if (userRecords.isEmpty()) {return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);}
        return new ResponseEntity<>(userRecords, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<AppUser> create(@Valid @RequestBody UserDto user) {
        AppUser newUser = new AppUser(user.getName());
        return new ResponseEntity<>(this.userService.createUser(newUser), HttpStatus.CREATED);
    }

    @GetMapping("/{username}")
    ResponseEntity<AppUser> findUserByUserName(@PathVariable String username) {

        return new ResponseEntity<>(this.userService.getUserByUserName(username), HttpStatus.OK);
    }

    @DeleteMapping()
    ResponseEntity<Void> deleteUserByUuid(@RequestParam Long id) {
        this.userService.deleteUserByUuid(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
