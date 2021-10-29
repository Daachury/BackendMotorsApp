package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_modelo")
@Data
public class Modelo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idmodelo;

	private int idVehiculo;
	
	private String modelo;
	
	private String marca;
	
	private String tipo;
	
	private String estado;
}
