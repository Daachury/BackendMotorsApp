package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_tipoComponentes")
@Data
public class TipoComponente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTipoComponente;
	
	private String nombre_componente;
}
