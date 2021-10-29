package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_mantenimiento")
@Data
public class Mantenimientos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idmantenimientos;

	private int idComponente;
	
	private String nombre;
	
	private String kilometraje;

}
