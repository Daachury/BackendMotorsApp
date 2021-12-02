package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_vehiculo")
@Data
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVehiculo;

	private String nombre;

	private Boolean nuevo;

	private Integer kilometraje;
	
	private Long idUsuario;	
	
	private Long  idModelo;

	/*@JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
	@ManyToOne(optional = false)
	private Usuario idUsuario;
	
	@JoinColumn(name = "idModelo", referencedColumnName = "idModelo")
	@ManyToOne(optional = false)
	private Modelo idModelo;*/
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idComponente")
	private List<Componentes> componentesList;*/
	
	/*@OneToMany(mappedBy = "idAlerta")
	private List<Alerta> alertaList;*/
	
}
