package com.example.sbi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EnvSpecificApplicationProperties/GetCurrentEnvironment")
@Component
public class EnvSpecificApplicationPropertiesResourceController {

	@Value("${family.name}")
	public String name;

	@GetMapping
	public void getCurrentEnvironment() {

		System.out.println("\n \n ##### HERE");
		
		System.out.println("\n Environment = "+ name);

	}

}
