package com.motors.sport.app.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motors.sport.app.entity.Usuario;
import com.motors.sport.app.entity.Vehiculo;
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
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Usuario> readvehiculo(@PathVariable Long id){
		return new ResponseEntity<Usuario>(loginRepository.findById(id).get(),HttpStatus.OK);
	}
	
	/*@GetMapping("/user/{id}{password}")
	public ResponseEntity<Usuario> readuser(@PathVariable Long usuario, @PathVariable Long clave ){
		ResponseEntity<List<Usuario>> listaUsuarios = new ResponseEntity<List<Usuario>>(loginRepository.findAll(),HttpStatus.OK);
		
		List<Usuario> lista = new List<Usuario>)loginRepository.findAll();
		for (int i = 0; i < listaUsuarios.(); i++) {
			System.out.println(listaUsuarios.);
		}
		for (List<Usuario> obj : listaUsuarios) {
			System.out.println();
		}
		
		return new ResponseEntity<Usuario>(loginRepository.fin(id).get(),HttpStatus.OK);
	}*/
	
	
}
