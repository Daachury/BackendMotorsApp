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

import com.motors.sport.app.entity.PartesVehiculo;
import com.motors.sport.app.entity.Vehiculo;
import com.motors.sport.app.repository.ParteVehiculoRepository;
import com.motors.sport.app.repository.VehiculoRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
/**
 * @author andre
 *
 */
public class ParteVehiculoController {
	@Autowired
	ParteVehiculoRepository repository;
		
	@PostMapping("/addParteVehiculo")
	public ResponseEntity<PartesVehiculo> createNewUser(@RequestBody PartesVehiculo partesVehiculo){
		return new ResponseEntity<PartesVehiculo>(repository.save(partesVehiculo),HttpStatus.CREATED);
	}
	
	@GetMapping("/allParteVehiculo")
	public ResponseEntity<List<PartesVehiculo>> readvehiculos(){
		return new ResponseEntity<List<PartesVehiculo>>(repository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/allParteVehiculo/{id}")
	public ResponseEntity<PartesVehiculo> readvehiculo(@PathVariable Long id){
		return new ResponseEntity<PartesVehiculo>(repository.findById(id).get(),HttpStatus.OK);
	}
	
	@DeleteMapping("allParteVehiculo/{id}")
	public ResponseEntity<PartesVehiculo> deleteVehiculo(@PathVariable Long id){
		repository.deleteById(id);
		return new ResponseEntity<PartesVehiculo>(HttpStatus.NO_CONTENT);
	}
}
