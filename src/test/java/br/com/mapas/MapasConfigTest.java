package br.com.mapas;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.mapas.config.BootStrapSpringWeb;
import br.com.mapas.config.JdbcConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={BootStrapSpringWeb.class,JdbcConfiguration.class})
public abstract class MapasConfigTest {
	
	static{
		System.setProperty("spring.profiles.active","teste");
		
	}

	

}
