package io.github.prem_sh.astrobells.controllers;

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

import io.github.prem_sh.astrobells.models.entities.BlogPost;



@RestController
@RequestMapping("/blogs")
public class BlogPostController {
	@PostMapping
	public ResponseEntity<BlogPost> create(@RequestBody BlogPost blogPost){
		return new ResponseEntity<BlogPost>(blogPost, HttpStatus.OK);
	}
	@GetMapping("/{title}/analytics")
	public ResponseEntity<String> getAll(@RequestBody BlogPost blogPost){
		return new ResponseEntity<String>("Analytics", HttpStatus.OK);
	}
	@GetMapping("/{title}")
	public ResponseEntity<BlogPost> getblog(@PathVariable String title){
		return new ResponseEntity<BlogPost>(new BlogPost(), HttpStatus.OK);
	}
	@PutMapping("/{title}")
	public ResponseEntity<BlogPost> edit(@RequestBody BlogPost blogPost, @PathVariable String title){
		return new ResponseEntity<BlogPost>(blogPost, HttpStatus.OK);
	}
	@DeleteMapping("/{title}")
	public ResponseEntity<String> delete(@PathVariable String title){
		return new ResponseEntity<String>("blogPost deleted successfully", HttpStatus.OK);
	}
}
