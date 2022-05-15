package com.tiago.workshop.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.workshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User(1L, "Maria", "maria@gmail.com");
		User fulano = new User(2L, "Fulano Masrop", "fulano@gmail.com");
		User beltrano = new User(3L, "Beltrano Scarlet", "beltrano@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, fulano, beltrano));
		return ResponseEntity.ok().body(list);
	}
}
