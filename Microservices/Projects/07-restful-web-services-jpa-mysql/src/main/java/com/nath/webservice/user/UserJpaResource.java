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

import com.nath.webservice.jpa.RoleRepository;
import com.nath.webservice.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {
	
	private UserRepository userRepo;
	
	private RoleRepository roleRepo;
	
	public UserJpaResource(UserRepository userRepo, RoleRepository roleRepo ) {
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return userRepo.findAll();
		
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id){
		Optional<User> user = userRepo.findById(id);
		if(user.isEmpty() )
			throw new UserNotFoundException("id:"+ id);
		EntityModel<User> entiryModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		entiryModel.add(link.withRel("all-users"));
		return entiryModel;
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		userRepo.deleteById(id);	
	}
	
	@GetMapping("/users/{id}/roles")
	public List<Role> retrieveRoleForUser(@PathVariable int id){
		Optional<User> user = userRepo.findById(id);
		if(user.isEmpty() )
			throw new UserNotFoundException("id:"+ id);
		return user.get().getRoles();
		
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUsers(@Valid @RequestBody User user) {
		User savedUser = userRepo.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location ).build();
		
	}
	
	@PostMapping("/users/{id}/roles")
	public ResponseEntity<Object> createRoleForUser(@PathVariable int id, @Valid @RequestBody Role role){
		Optional<User> user = userRepo.findById(id);
		if(user.isEmpty() )
			throw new UserNotFoundException("id:"+ id);
		
		role.setUser(user.get());
		Role savedRole = roleRepo.save(role);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedRole.getId())
				.toUri();
		
		return ResponseEntity.created(location ).build();
		
	}

}
