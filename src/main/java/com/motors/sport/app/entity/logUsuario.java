package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_logUsuario")
@Data
public class logUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idlog;
	
	private int idUsuario;
	
	private String accion;
	
	private String fecha;
	
	private int idVehiculo;

	

}
