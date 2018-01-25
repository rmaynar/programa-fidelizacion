package com.maynar.fideliza.webapp.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.maynar.fideliza.webapp.mvc","com.maynar.fideliza.services","com.maynar.fideliza.dao"})
public class ConfiguracionWeb implements WebMvcConfigurer {

	/**
	 * Para dar visibilidad a recursos
	 * @return
	 */
	
	
	@Bean
	public View miVista() {
		return new InternalResourceView("/WEB-INF/jsps/index.jsp");
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
	}

	@Bean
	public View otraVista() {
		return new InternalResourceView("/WEB-INF/jsps/index2.jsp");
	}
	
	@Bean
	public View formulario() {
		return new InternalResourceView("/WEB-INF/jsps/formulario.jsp");
	}

	@Bean
	public ViewResolver beanNameViewResolver() {
		BeanNameViewResolver viewResolver = new BeanNameViewResolver();
		viewResolver.setOrder(1);
		return viewResolver;
	}

	@Bean
	public ViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addViewController("/inicio").setViewName("login");
		registry.addViewController("/").setViewName("login");
	}
	
	
}
