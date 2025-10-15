package com.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	@GetMapping("/")
	public String home() {
		return "SpringBoot Practice";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Jenkins Practice";
	}

}
