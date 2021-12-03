package com.motors.sport.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.motors.sport.app.entity.Usuario;
import com.motors.sport.app.repository.LoginRepository;

/*public class UsuarioService {
	
	@Autowired
	LoginRepository loginRepository;
	
	public void ingresarUsuario(Usuario usuario) {
		
		loginRepository.save(usuario);
	}

}*/

public interface UsuarioService {
	

	public Usuario findByNombre (String username);

}


