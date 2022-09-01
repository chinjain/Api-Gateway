//package com.developer.gateway;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.web.server.ServerWebExchange;
//
//import reactor.core.publisher.Mono;
//
//public class MyPostFilter implements GlobalFilter, Ordered {
//
//	// this post filter will execute at last after the Rest api hit properly !!!
//
//	@Override
//	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//		// TODO Auto-generated method stub
//
//		Logger log = LoggerFactory.getLogger(MyPostFilter.class);
//		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//
//		}));
//	}
//
////	this will provide the order in which this post filter will execute !!
//	@Override
//	public int getOrder() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
