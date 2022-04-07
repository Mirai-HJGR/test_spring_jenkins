package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class MiControlador {

	@GetMapping("/mundo")
	public String saludo(){
		return("Hola Hector");
	}

}
