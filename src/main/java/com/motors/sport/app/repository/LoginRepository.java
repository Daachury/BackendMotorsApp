package com.motors.sport.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.motors.sport.app.entity.Usuario;

@Repository
public interface LoginRepository extends JpaRepository<Usuario, Long>{

	
}
