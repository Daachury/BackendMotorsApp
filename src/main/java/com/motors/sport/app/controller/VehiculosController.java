package com.motors.sport.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motors.sport.app.entity.Usuario;
import com.motors.sport.app.entity.Vehiculo;

import com.motors.sport.app.repository.VehiculoRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class VehiculosController {
	
	
	@Autowired
	VehiculoRepository repository;
		
	@PostMapping("/addVehiculo")
	public ResponseEntity<Vehiculo> createNewUser(@RequestBody Vehiculo vehiculo){
		return new ResponseEntity<Vehiculo>(repository.save(vehiculo),HttpStatus.CREATED);
	}
	
	@GetMapping("/allVehiculo")
	public ResponseEntity<List<Vehiculo>> readvehiculos(){
		return new ResponseEntity<List<Vehiculo>>(repository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/allVehiculo/{id}")
	public ResponseEntity<Vehiculo> readvehiculo(@PathVariable Long id){
		return new ResponseEntity<Vehiculo>(repository.findById(id).get(),HttpStatus.OK);
	}
	
	@DeleteMapping("allVehiculo/{id}")
	public ResponseEntity<Vehiculo> deleteVehiculo(@PathVariable Long id){
		repository.deleteById(id);
		return new ResponseEntity<Vehiculo>(HttpStatus.NO_CONTENT);
	}
}
