package com.personal_webflux.exception;

/****************
 * @author 		: Ing. Pablo Uceda
 * @Fecha  		: 12/03/2026
 * @Comentario	: Programa para configurar el CustomException. 
 * @version		: 1.0
 ****************/

import org.springframework.http.HttpStatus;

public class CustomException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2866278459889583257L;
	private HttpStatus status;
	
	public CustomException(HttpStatus status, String message) {
		super (message);
		this.status = status;
		
	}

	public HttpStatus getStatus() {
		return status;
	}
	
	

}
