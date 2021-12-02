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

	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String nombre;
	
	private String apellido;
	
	private int telefono;
	
	private String estado;
	
	private int numeroDocumento;
	
	private String tipoDocumento;
	
	private String correo;
	
	private String password;
	
	@Column(name="create_at",nullable=false, updatable=false)
	@CreationTimestamp
	private Date createAt;
	
	@Column(name="update_at")
	@UpdateTimestamp
	private Date updatedAt;
	
	@OneToMany(mappedBy = "idlog")
	private List<logUsuario> logUsuarioList;*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String nombre;
	
	private String apellido;
	
	private int telefono;
	
	private String estado;
	
	private int numeroDocumento;
	
	private String tipoDocumento;
	
	private String correo;
	
	private String password;
	
	/*@Column(name="create_at",nullable=false, updatable=false)
	@CreationTimestamp
	private Date createAt;
	
	@Column(name="update_at")
	@UpdateTimestamp
	private Date updatedAt;*/
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
	private List<logUsuario> logUsuarioList;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
	private List<Vehiculo> vehiculosList;*/
}
