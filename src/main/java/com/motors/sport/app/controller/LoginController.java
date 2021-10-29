package com.motors.sport.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motors.sport.app.entity.Usuario;
import com.motors.sport.app.repository.LoginRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LoginController {

	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping("/alluser")
	public ResponseEntity<List<Usuario>> readUsuarios(){
		return new ResponseEntity<List<Usuario>>(loginRepository.findAll(),HttpStatus.OK);
	}
	
	
}
