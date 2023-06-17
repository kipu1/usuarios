/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.service;

import com.tendencias.app.Usuarios.model.Empleado;
import com.tendencias.app.Usuarios.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS ROG
 */
@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Integer> implements GenericService<Empleado, Integer> {

    @Autowired
    EmpleadoRepository empleadoRepository;
    
    @Override
    public CrudRepository<Empleado, Integer> getDao() {
       
       return empleadoRepository;
    }
//    public double calcularSueldo() {
//        int dias_trabajo = 0;
//        double sueldo = dias_trabajo * 15; // Calcula el sueldo multiplicando los días trabajados por el costo por día
//        return sueldo;
//    }
    
}
   



