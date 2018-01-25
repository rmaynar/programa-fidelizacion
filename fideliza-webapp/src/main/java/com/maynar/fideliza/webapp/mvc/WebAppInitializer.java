package com.maynar.fideliza.webapp.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// Cargamos el contexto de spring desde Javaconfig
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		
		// Al utilizar Javaconfig, la ruta será un paquete
		webApplicationContext.setConfigLocation("com.maynar.fideliza.webapp.mvc.config");
		
		//Registramos el servlet
		Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
		//la raíz de la aplicación se convierte en parte del dispatcher
		dispatcher.addMapping("/");
		dispatcher.setLoadOnStartup(1);
	}

}
