/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;

import com.tendencias.app.Usuarios.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author ASUS ROG
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
    @Query(value = "Select * from empleado u where u.nombre = :nombre", nativeQuery = true)
    public Empleado buscarUsuario(String nombre);
}
