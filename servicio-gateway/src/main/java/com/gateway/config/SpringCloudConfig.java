package com.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
	
	
	
   
	
	@Bean
	
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		
		
		return builder.routes()
				.route(r -> 
				       r.path("/clientes/**")
				       .filters(
				    		   f -> f.stripPrefix(1)
				    		   )
				       .uri("http://localhost:8761"))
				       
				       .route(r -> 
				       r.path("/compras/**")
				       .filters(
				    		   f -> f.stripPrefix(1)
				    		   )
				       .uri("http://localhost:8761")
		)
				       
				       .route(r -> 
				       r.path("/productos/**")
				       .filters(
				    		   f -> f.stripPrefix(1)
				    		   )
				       .uri("http://localhost:8761")
		)
				       
				       .route(r -> 
				       r.path("/reclamos/**")
				       .filters(
				    		   f -> f.stripPrefix(1)
				    		   )
				       .uri("http://localhost:8761")
		)
				.build();
		
	}
	
	


}
