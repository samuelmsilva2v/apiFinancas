package com.example.demo.infrastructure.components;

import java.io.IOException;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtFilterComponent extends GenericFilterBean {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		final HttpServletRequest request = (HttpServletRequest) servletRequest;
		final HttpServletResponse response = (HttpServletResponse) servletResponse;
		final String authHeader = request.getHeader("Authorization");

		if ("OPTIONS".equals(request.getMethod())) {
			response.setStatus(HttpServletResponse.SC_OK);
			filterChain.doFilter(request, response);
		} else {
			if (authHeader == null || !authHeader.startsWith("Bearer ")) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Acesso não autorizado.");
				return;
			} else {

				String jwtSecret = "6327843f-a72d-45cb-8e8b-d10a3d95dd5a";

				final String token = authHeader.substring(7);
				Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
				request.setAttribute("claims", claims);
				filterChain.doFilter(request, response);
			}
		}
	}
}
