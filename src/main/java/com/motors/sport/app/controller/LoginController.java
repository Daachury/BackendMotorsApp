package com.motors.sport.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


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
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Usuario> readvehiculo(@PathVariable Long id){
		return new ResponseEntity<Usuario>(loginRepository.findById(id).get(),HttpStatus.OK);
	}
	
	@GetMapping("/inicioon")
	public ResponseEntity<Usuario> readLogin(@PathVariable Long id){
		return new ResponseEntity<Usuario>(
				loginRepository.findById(id).get(),HttpStatus.OK);
	}
	
	@GetMapping("/inicioSesion/{username}")
	public ResponseEntity<Usuario> inicioSesion(@PathVariable String username) {
		System.out.println("user: " + username);
		Long id=null;

		List<Usuario> listaUsuarios = loginRepository.findAll();
		System.out.println("Lista 1:\n"+listaUsuarios.size());
		if(!listaUsuarios.isEmpty()) {
			for (Usuario obj : listaUsuarios) {
				System.out.println(listaUsuarios.size());
				if (obj.getUsername().equals(username)) {
					System.out.println("entro");
					id = (long) obj.getIdUsuario();
				}
			}
		}
		System.out.println("EL hpta : "+id);
		return new ResponseEntity<Usuario>(loginRepository.findById(id).get(), HttpStatus.OK);
	}
		
}
