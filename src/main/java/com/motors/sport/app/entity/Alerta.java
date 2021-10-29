package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_alerta")
@Data
public class Alerta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAlerta;
	
	private int idVehiculo;
	
	private String nombre;
	
	private String observaciones;
	
	private String fecha;
	
	
	

}
