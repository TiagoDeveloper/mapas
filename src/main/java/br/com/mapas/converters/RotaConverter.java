package br.com.mapas.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.mapas.models.Rota;

@Component
public class RotaConverter implements Converter<String, Rota>{

	@Override
	public Rota convert(String rota) {
		
		System.out.println(rota);
		
		return new Rota();
	}

}
