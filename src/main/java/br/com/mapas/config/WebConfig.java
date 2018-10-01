package br.com.mapas.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.mapas.converters.RotaConverter;

@Configuration
@EnableWebMvc
@ComponentScan("br.com.mapas")
public class WebConfig implements WebMvcConfigurer{
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new RotaConverter());
	}

}
