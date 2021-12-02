/**
 * 
 */
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

import com.motors.sport.app.entity.Modelo;
import com.motors.sport.app.entity.Vehiculo;
import com.motors.sport.app.repository.ModeloRepository;
import com.motors.sport.app.repository.VehiculoRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
/**
 * @author andre
 *
 */
public class ModeloController {
	@Autowired
	ModeloRepository repository;
		
	@PostMapping("/addModelo")
	public ResponseEntity<Modelo> createNewUser(@RequestBody Modelo modelo){
		return new ResponseEntity<Modelo>(repository.save(modelo),HttpStatus.CREATED);
	}
	
	@GetMapping("/allModelo")
	public ResponseEntity<List<Modelo>> readvehiculos(){
		return new ResponseEntity<List<Modelo>>(repository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/allModelo/{id}")
	public ResponseEntity<Modelo> readvehiculo(@PathVariable Long id){
		return new ResponseEntity<Modelo>(repository.findById(id).get(),HttpStatus.OK);
	}
	
	@DeleteMapping("allModelo/{id}")
	public ResponseEntity<Modelo> deleteVehiculo(@PathVariable Long id){
		repository.deleteById(id);
		return new ResponseEntity<Modelo>(HttpStatus.NO_CONTENT);
	}
}
