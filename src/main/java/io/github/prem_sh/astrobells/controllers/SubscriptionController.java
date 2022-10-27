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

import io.github.prem_sh.astrobells.models.entities.Subscription;


@RestController
@RequestMapping("/subscription")
public class SubscriptionController {
	@PostMapping
	public ResponseEntity<Subscription> create(@RequestBody Subscription subscription){
		return new ResponseEntity<Subscription>(subscription, HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Subscription>> getAll(@RequestBody Subscription subscription){
		return new ResponseEntity<List<Subscription>>(new ArrayList<Subscription>(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Subscription> getById(@PathVariable Long id){
		return new ResponseEntity<Subscription>(new Subscription(), HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Subscription> update(@RequestBody Subscription subscription, @PathVariable Long id){
		return new ResponseEntity<Subscription>(subscription, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		return new ResponseEntity<String>("subscription deleted successfully", HttpStatus.OK);
	}
}
