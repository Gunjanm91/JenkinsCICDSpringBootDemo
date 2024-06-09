package com.tcs.trs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

	@GetMapping("/message")
	public String showMeassge()
	{
		return "Welcome to CICD Pipeline Demo Project !!!";
	}
}
