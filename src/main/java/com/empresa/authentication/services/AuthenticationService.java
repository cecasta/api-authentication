package com.empresa.authentication.services;

import org.springframework.stereotype.Service;

import com.empresa.authentication.models.dto.AuthDto;
import com.empresa.authentication.services.interfaces.AuthenticationServiceInterface;



@Service
public class AuthenticationService implements AuthenticationServiceInterface{

	@Override
	public void autenticacion(AuthDto rq) throws Exception {
		
		System.out.println(rq.getEmail());
		System.out.println(rq.getPassword());
		
	}

}
