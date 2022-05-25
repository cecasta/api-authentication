package com.empresa.authentication.services.interfaces;

import com.empresa.authentication.models.dto.AuthDto;

public interface AuthenticationServiceInterface {
	
	void autenticacion(AuthDto rq)  throws Exception;

}
