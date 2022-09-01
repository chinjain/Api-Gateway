//package com.developer.gateway;
//
//import java.util.Set;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//
//import reactor.core.publisher.Mono;
//
//@Component
//public class MyPreFilter implements GlobalFilter {
//
//	final Logger log = LoggerFactory.getLogger(MyPreFilter.class);
//
//	@Override
//	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//		// TODO Auto-generated method stub
//
//		log.info("Pre Filter Executed");
//
//		String reqPath = exchange.getRequest().getPath().toString();
//		log.info("Request path = " + reqPath);
//
//		HttpHeaders header = exchange.getRequest().getHeaders();
//
//		Set<String> headerNames = header.keySet();
//
//		headerNames.forEach((headerName) -> {
//
//			String headerValue = header.getFirst(headerName);
//			log.info(headerName + " = "+ headerValue);	
//
//		});
//
//		return chain.filter(exchange);
//	}
//
//}
