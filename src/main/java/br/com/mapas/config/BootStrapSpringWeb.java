package br.com.mapas.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Tiago
 *
 */
public class BootStrapSpringWeb implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletCxt) throws ServletException {
		AnnotationConfigWebApplicationContext acwa = new AnnotationConfigWebApplicationContext();
		acwa.scan("br.com.mapas");
		
		servletCxt.addListener(new ContextLoaderListener(acwa));
		
        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", new DispatcherServlet(acwa));
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
	}

	
}
