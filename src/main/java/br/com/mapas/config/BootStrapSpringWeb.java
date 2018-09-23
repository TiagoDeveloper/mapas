package br.com.mapas.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Tiago
 *
 */
public class BootStrapSpringWeb implements WebApplicationInitializer{

	private AnnotationConfigWebApplicationContext acwa;
	
	private DispatcherServlet dispatcherServlet;
	
	/* (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletCxt) throws ServletException {
		this.acwa = new AnnotationConfigWebApplicationContext();
		//this.acwa.register();
		this.acwa.scan("br.com.mapas.controllers");
		this.acwa.refresh();
		
		this.dispatcherServlet = new DispatcherServlet(this.acwa);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
	}

}
