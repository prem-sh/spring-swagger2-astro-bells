package io.github.prem_sh.astrobells.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.prem_sh.astrobells.models.entities.User;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user){
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAll(@RequestBody User user){
		return new ResponseEntity<List<User>>(new ArrayList<User>(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> getById(@PathVariable Long id){
		return new ResponseEntity<User>(new User(), HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<User> update(@RequestBody User user, @PathVariable Long id){
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		return new ResponseEntity<String>("user deleted successfully", HttpStatus.OK);
	}
}
