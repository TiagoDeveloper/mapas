package br.com.mapas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vividsolutions.jts.geom.Point;

import br.com.mapas.models.Rota;
import br.com.mapas.models.Trecho;
import br.com.mapas.repositorys.TrechoRepository;
import br.com.mapas.services.TrechoService;


@RestController
public class MapaController {

	@Autowired
	private TrechoService trechoService;
	
	@GetMapping
	public String index(){
		
		
		return "hello world!!!";
	}
	
	@PostMapping("/geometry")
	public @ResponseBody String getGeometry(@RequestParam Trecho geometry){
		geometry.setNome("Teste");
		System.out.println(geometry.getLineString().toText());
		this.trechoService.salvarTrecho(geometry);
		return geometry.getLineString().toText();
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
