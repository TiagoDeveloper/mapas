package br.com.mapas.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.mapas.models.Trecho;

@Component
public class TrechoConverter implements Converter<String, Trecho> {

	@Override
	public Trecho convert(String lineStringWkt) {
		return new Trecho(lineStringWkt);
	}

}
