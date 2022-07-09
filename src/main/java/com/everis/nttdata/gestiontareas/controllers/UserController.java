package com.everis.nttdata.gestiontareas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.everis.nttdata.gestiontareas.entities.UserEntity;
import com.everis.nttdata.gestiontareas.services.UserServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = {"Users"})
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/add-user")
	@ApiOperation(value = "Add new user")
	public Long saveUser(@RequestBody UserEntity user) {
		userService.saveAndUpdateUser(user);
		return user.getId();
	}
	
	@GetMapping("/find-all-users")
	@ApiOperation(value = "List of available users")
	public List<UserEntity> findAllUsers(){
		return userService.findAllUsers();
	}
	
	@GetMapping("/find-user/{id}")
	@ApiOperation(value = "List a user by id")
	public Optional<UserEntity> findUserById(@PathVariable Long id) {
		return userService.findUserById(id);
	}
	
	@GetMapping("/find-email/{email}")
	@ApiOperation(value = "List a user by email")
	public List<UserEntity> findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@PutMapping("/update/{id}")
	@ApiOperation(value = "Update user")
	public UserEntity updateUser(@RequestBody UserEntity user) {
		userService.saveAndUpdateUser(user);
		return user;
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "Delete user")
	public void deleteUserById(@PathVariable Long id) {
		userService.deleteById(id);
	}
	
}
