package com.app.user.service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.user.service.model.dto.CreateUser;
import com.app.user.service.model.dto.UserDto;
import com.app.user.service.model.dto.UserUpdate;
import com.app.user.service.model.dto.UserUpdateStatus;
import com.app.user.service.model.dto.response.Response;
import com.app.user.service.service.UserService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> createUser(@RequestBody CreateUser userDto) {
        log.info("creating user with: {}", userDto.toString());
        return ResponseEntity.ok(userService.createUser(userDto));
    }

   
    @GetMapping
    public ResponseEntity<List<UserDto>> readAllUsers() {
        return ResponseEntity.ok(userService.readAllUsers());
    }

    
    @GetMapping("auth/{authId}")
    public ResponseEntity<UserDto> readUserByAuthId(@PathVariable String authId) {
        log.info("reading user by authId");
        return ResponseEntity.ok(userService.readUser(authId));
    }

    
    @PatchMapping("/{id}")
    public ResponseEntity<Response> updateUserStatus(@PathVariable Long id, @RequestBody UserUpdateStatus userUpdate) {
        log.info("updating the user with: {}", userUpdate.toString());
        return new ResponseEntity<>(userService.updateUserStatus(id, userUpdate), HttpStatus.OK);
    }

   
    @PutMapping("{id}")
    public ResponseEntity<Response> updateUser(@PathVariable Long id, @RequestBody UserUpdate userUpdate) {
        return new ResponseEntity<>(userService.updateUser(id, userUpdate), HttpStatus.OK);
    }

    
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> readUserById(@PathVariable Long userId) {
        log.info("reading user by ID");
        return ResponseEntity.ok(userService.readUserById(userId));
    }

   
    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<UserDto> readUserByAccountId(@PathVariable String accountId) {
        return ResponseEntity.ok(userService.readUserByAccountId(accountId));
    }
}
