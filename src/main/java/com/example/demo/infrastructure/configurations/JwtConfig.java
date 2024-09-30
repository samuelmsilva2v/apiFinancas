package com.example.demo.infrastructure.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.infrastructure.components.JwtFilterComponent;

@Configuration
public class JwtConfig {

	@Bean
	FilterRegistrationBean<JwtFilterComponent> jwtFilter() {

		FilterRegistrationBean<JwtFilterComponent> filter = new FilterRegistrationBean<JwtFilterComponent>();
		filter.setFilter(new JwtFilterComponent());

		filter.addUrlPatterns("/api/categorias");
		filter.addUrlPatterns("/api/contas");
		filter.addUrlPatterns("/api/conta-categoria");

		return filter;
	}
}
