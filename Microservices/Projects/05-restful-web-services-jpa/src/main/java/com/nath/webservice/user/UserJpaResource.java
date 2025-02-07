package com.nath.webservice.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nath.webservice.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {
		
	private UserRepository repository;
	
	public UserJpaResource(UserRepository repository ) {
		this.repository = repository;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return repository.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id){
		Optional<User> user = repository.findById(id);
		if(user.isEmpty() )
			throw new UserNotFoundException("id:"+ id);
		EntityModel<User> entiryModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		entiryModel.add(link.withRel("all-users"));
		return entiryModel;
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		repository.deleteById(id);
		
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUsers(@Valid @RequestBody User user) {
		User savedUser = repository.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location ).build();
		
	}

}
