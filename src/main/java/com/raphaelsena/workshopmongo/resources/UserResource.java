package com.raphaelsena.workshopmongo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphaelsena.workshopmongo.domain.User;
import com.raphaelsena.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Eduarda", "maria@gmail.com");
		User felipe = new User("2", "Felipe Sena", "felipe@gmail.com");
		List<User> list = service.findAll();
		list.addAll(Arrays.asList(maria, felipe));
		return ResponseEntity.ok().body(list);
	}
}
