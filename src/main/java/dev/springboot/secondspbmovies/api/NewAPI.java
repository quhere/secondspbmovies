package dev.springboot.secondspbmovies.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class NewAPI {
	@GetMapping(value = "/test")
	public String TestSpring() {
		return "Hallo";
	}
}
