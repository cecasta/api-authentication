package com.empresa.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.authentication.commons.ControlBase;
import com.empresa.authentication.models.dto.AuthDto;
import com.empresa.authentication.services.interfaces.AuthenticationServiceInterface;

@RestController
@RequestMapping("/api/v1/athentication")
public class AuthenticationController extends ControlBase {

	@Autowired
	private AuthenticationServiceInterface authService;
	
	
	@GetMapping()
	public ResponseEntity<String> auth(@RequestBody AuthDto auth) {
		
		try {
			authService.autenticacion(auth);
			return new ResponseEntity<>("LOGIN OK", super.httpHeaderOk(), HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<>("LOGIN ERROR", super.httpHeaderOk(), HttpStatus.FORBIDDEN);
		}
		

	}
}
