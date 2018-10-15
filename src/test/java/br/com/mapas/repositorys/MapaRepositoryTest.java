package br.com.mapas.repositorys;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.mapas.MapasConfigTest;
import br.com.mapas.models.Trecho;
import br.com.mapas.repositorys.TrechoRepository;

public class MapaRepositoryTest extends MapasConfigTest{

	@Autowired
	private TrechoRepository trechoRepository;
	
	@Test
	public void trechoRepositoryTest(){
		
		String lineString = "LineString (-43.93611788749695 -19.93541508839238, -43.93486797809601 -19.93573279511913)";
		
		Trecho trecho = this.trechoRepository.save(new Trecho(null, "Rua dos Inconfidentes", lineString));
		
		assertThat(trecho.getId() != null);
	}
	
	
}
