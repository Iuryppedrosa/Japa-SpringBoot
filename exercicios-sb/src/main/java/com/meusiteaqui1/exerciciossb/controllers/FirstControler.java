package com.meusiteaqui1.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControler 
{

	//@RequestMapping
	@GetMapping(path = {"ola"})
	public String ola()
	{
		return "Ola Mundo doido";
	}
}
