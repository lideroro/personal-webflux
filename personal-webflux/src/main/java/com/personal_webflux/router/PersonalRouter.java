package com.personal_webflux.router;

import org.springframework.boot.autoconfigure.web.WebProperties;

/****************
 * @author 		: Ing. Pablo Uceda
 * @Fecha  		: 10/03/2026
 * @Comentario	: Programa para configurar el PersonalRouter con Web-Flux.. 
 * @version		: 1.1
 ****************/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.personal_webflux.handler.PersonalHandler;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class PersonalRouter {
	
	private static final String PATH = "personal";
	
	@Bean
	public WebProperties.Resources resources () {
		return new WebProperties.Resources();
	}
	
	@Bean
	RouterFunction<ServerResponse> Router(PersonalHandler handler) {
		return RouterFunctions.route()
			   .GET(PATH, handler::getAll)
			   .GET(PATH + "/{id}", handler::getOne)
			   .POST(PATH, handler::save)
			   .PUT(PATH + "/{id}", handler::update)
			   .DELETE(PATH + "/{id}", handler::delete)
			   .build();
	}
	

}
