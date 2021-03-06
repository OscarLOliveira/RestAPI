package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	// GET
	@RequestMapping(value="/user", method=RequestMethod.GET)   
	public List<User> getUser() {
		System.out.println("get");

		List<User> users = new ArrayList<>();
		
		User user1 = new User("Oscar", "oscar.informatica@uol.com.br");
		User user2 = new User("Luiz", "luiz.informatica@uol.com.br");
		
		users.add(user1);
		users.add(user2);

		return users;

	}
	
	// GET com PARAMETROS
	@RequestMapping(value="/user/{name}", method=RequestMethod.GET)   
	public List<User> getUser1(@PathVariable String name) {
		System.out.println("get com parametros");

		List<User> users = new ArrayList<>();
		
		User user1 = new User("Oscar", "oscar.informatica@uol.com.br");
		User user2 = new User(name, name + "@uol.com.br");
		
		users.add(user1);
		users.add(user2);

		return users;

	}	
	
	// POST
		@RequestMapping(value="/user", method=RequestMethod.POST)   
		public User setUser(@RequestBody User user) {
			System.out.println("PUT");
			
			return user;


		}		



}
