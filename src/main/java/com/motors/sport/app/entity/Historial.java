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
public class Historial {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAlerta;

	private String fecha;
	
	private String observaciones;
	
	private int idUsuario;
	
	private int idVehiculo;
		/*@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long idAlerta;

		private String fecha;
		
		private String observaciones;
		
		private int idUsuario;
		
		private int idVehiculo;*/
		
}
