package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_componentes")
@Data
public class Componentes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idComponente;
	
	private int idVehiculo;
	
	private int tipoComponente;
	
	private String vidaUtil;
	
	private String estado;
	
	private String reutilizable;
	
}
