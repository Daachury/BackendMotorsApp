package com.motors.sport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motors.sport.app.entity.Usuario;
import com.motors.sport.app.repository.LoginRepository;
import com.motors.sport.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override 
	public Usuario findByNombre(String usuario) {
		
		return null;
	}
}
