package br.com.mapas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapaController {

	
	@GetMapping
	public String index(){
		
		
		return "hello world!!!";
	}
	
}
