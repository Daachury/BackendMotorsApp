package com.motors.sport.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.motors.sport.app.entity.Modelo;
import com.motors.sport.app.entity.Vehiculo;
@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}