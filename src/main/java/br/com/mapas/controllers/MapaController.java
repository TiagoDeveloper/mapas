package br.com.mapas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vividsolutions.jts.geom.Point;

import br.com.mapas.models.Rota;


@RestController
public class MapaController {

	
	@GetMapping
	public String index(){
		
		
		return "hello world!!!";
	}
	
	@PostMapping("/geometry")
	public @ResponseBody String getGeometry(@RequestParam String geometry){
		System.out.println(geometry);
		return geometry;
	}
	
	@GetMapping("/rota")
	public @ResponseBody Rota getRota(Rota rota){
		
		
		return rota;
	}
	@GetMapping("/teste")
	public @ResponseBody String getRota(){
		
		
		return "caiu";
	}
	
	
	
}
