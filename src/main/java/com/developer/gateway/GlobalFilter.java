package com.developer.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.google.common.net.HttpHeaders;

import io.jsonwebtoken.Jwts; 
import reactor.core.publisher.Mono;

//@Component
//public class GlobalFilter extends AbstractGatewayFilterFactory<GlobalFilter.Config> {
//
//	@Autowired
//	Environment env;
//
//	public GlobalFilter() {
//		// TODO Auto-generated constructor stub
//		super(Config.class);
//	}
//
//	public static class Config {
//
//	}
//
//	@Override
//	public GatewayFilter apply(Config config) {
//		// Exchange of data type server exchange !!
//		return (exchange, chain) -> {
//			ServerHttpRequest request = exchange.getRequest();
//			if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
//				return onError(exchange, "No Auhtorization Header", HttpStatus.UNAUTHORIZED);
//			}
//
//			String authHeader = request.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
//			String jwt = authHeader.replace("Bearer", "");
//
//			if (!isJwtValide(jwt)) {
//				return onError(exchange, "Jwt Token is not valid", HttpStatus.UNAUTHORIZED);
//			}
//			return chain.filter(exchange);
//		};
//	}
//
//	private Mono<Void> onError(ServerWebExchange exchange, String string, HttpStatus status) {
//		ServerHttpResponse response = exchange.getResponse();
//		response.setStatusCode(status);
//		return response.setComplete();
//	}
//
//	private boolean isJwtValide(String jwt) {
//		boolean returnValue = true;
//		String subject = null;
//		try {
//			subject = Jwts.parser().setSigningKey(env.getProperty("token.secret")).parseClaimsJws(jwt).getBody()
//					.getSubject();
//
//		} catch (Exception e) {
//			return false;
//		}
//
//		if (subject == null || subject.isEmpty()) {
//			return false;
//		}
//
//		return returnValue;
//	}

//}
