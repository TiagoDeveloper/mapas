package br.com.mapas.controllers;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.mapas.MapasConfigTest;
import br.com.mapas.models.Trecho;
import br.com.mapas.repository.TrechoRepository;

public class MapaRepository extends MapasConfigTest{

	@Autowired
	private TrechoRepository trechoRepository;
	
	@Test
	public void trechoRepositoryTest(){
		
//		assertThat(this.trechoRepository.findAll());
		
		for(Trecho trecho : this.trechoRepository.findAll()){
			System.out.println(trecho.getNome());
		}
		
		
	}
	
}
