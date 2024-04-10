package com.sbfordocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/welcome")
	public String getMessage() {
		return "I welcome You !!";
	}
}
