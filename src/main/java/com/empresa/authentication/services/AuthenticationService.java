package com.empresa.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.authentication.models.dto.AuthDto;
import com.empresa.authentication.models.entity.User;
import com.empresa.authentication.repository.UserRepository;
import com.empresa.authentication.services.interfaces.AuthenticationServiceInterface;



@Service
public class AuthenticationService implements AuthenticationServiceInterface{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void autenticacion(AuthDto rq) throws Exception {
		User user;
		user = userRepo.findByEmail(rq.getEmail());
		
		// validar la clave si correcta
		if (user != null) {
			if(rq.getPassword().equals(user.getPassword())) {
				System.out.println("Password correcto");
			}else{
				System.out.println("Password incorrecto");
			}
		}else {
			System.out.println("El usuario no existe");
		}
		// si no pasa la validacion de arriba es porque el usuario no existe o la clave no es correcta
		// por seguridad no se envia una respuesta al cliente api.. solo se le dice que no tiene permiso pero no se le dice
		// que la clave no es, ni tampoco que el usuario no existe. solo error
		
		throw new Exception("Error en al autenticación");
		
	}

}
