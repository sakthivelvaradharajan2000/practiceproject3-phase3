package com.junitspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	MyRepository repo;
	@PostMapping(value="/upload")
	public String get(@RequestParam("email") String email, @RequestParam("password") String pass) {
		users u = new users(email, pass);
		repo.save(u);
		return "Data received!";
	}
}
