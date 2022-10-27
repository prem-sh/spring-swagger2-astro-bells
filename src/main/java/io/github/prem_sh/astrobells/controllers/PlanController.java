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

import io.github.prem_sh.astrobells.models.entities.Plan;


@RestController
@RequestMapping("/plans")
public class PlanController {
	
	@PostMapping
	public ResponseEntity<Plan> create(@RequestBody Plan plan){
		return new ResponseEntity<Plan>(plan, HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Plan>> getAll(@RequestBody Plan plan){
		return new ResponseEntity<List<Plan>>(new ArrayList<Plan>(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Plan> getById(@PathVariable Long id){
		return new ResponseEntity<Plan>(new Plan(), HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Plan> update(@RequestBody Plan plan, @PathVariable Long id){
		return new ResponseEntity<Plan>(plan, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		return new ResponseEntity<String>("plan deleted successfully", HttpStatus.OK);
	}
}
