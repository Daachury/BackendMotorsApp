package com.motors.sport.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motors.sport.app.entity.Usuario;
import com.motors.sport.app.repository.LoginRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	LoginRepository loginRepository;
		
	@PostMapping("/newuser")
	public ResponseEntity<Usuario> createNewUser(@RequestBody Usuario usuario){
		
		return new ResponseEntity<Usuario>(loginRepository.save(usuario),HttpStatus.CREATED);
	}

	
}
