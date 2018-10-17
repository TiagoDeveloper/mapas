package br.com.mapas.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mapas.models.Trecho;
import br.com.mapas.repositorys.TrechoRepository;
import br.com.mapas.services.TrechoService;

@Service
public class TrechoServiceImpl implements TrechoService{

	@Autowired
	private TrechoRepository trechoRepository;
	
	@Override
	public Trecho salvarTrecho(Trecho trecho) {
		// TODO Auto-generated method stub
		return this.trechoRepository.save(trecho);
	}

}
