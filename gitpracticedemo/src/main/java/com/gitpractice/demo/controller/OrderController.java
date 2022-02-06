package com.gitpractice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order/{name}")
	public String welcome(@PathVariable String name) {

		return "Wecome :" + name;

	}
}
