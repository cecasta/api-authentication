package com.empresa.authentication.commons;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;

public class ControlBase {

	/**
	 * Establecer las configuraciones para response OK.
	 * 
	 * @return
	 */
	protected HttpHeaders httpHeaderOk() {
		HttpHeaders headers = new HttpHeaders();
		headers.put("Cache-Control", Arrays.asList("max-age=0"));
		headers.put("Access-Control-Allow-Origin", Arrays.asList("*"));
		return headers;
	}
	
}

