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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComponente;
	
	private long vidaUtil;
	
	private String nombre;
	
	private String reutilizable;
	
	private long idVehiculo;
	
	/*@JoinColumn(name = "idVehiculo", referencedColumnName = "idVehiculo")
	@ManyToOne(optional = false)
	private Vehiculo idVehiculo;*/

	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idMantenimiento")
	private List<Mantenimientos> mantenimientosList;*/

	
}
