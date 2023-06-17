/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.controller;

import com.tendencias.app.Usuarios.model.Empleado;
import com.tendencias.app.Usuarios.service.EmpleadoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS ROG
 */
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
 
    @Autowired
    EmpleadoServiceImpl empleadoService;
    
    @GetMapping("/get")
    public ResponseEntity<List<Empleado>> listaEmpleado() {
        return new ResponseEntity<>(empleadoService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/post")
    public ResponseEntity<Empleado> crearRol(@RequestBody Empleado u) {
        
        return new ResponseEntity<>(empleadoService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado u) {
        Empleado emp = empleadoService.findById(id);
        if (emp != null) {
            try {
                emp.setApellido(u.getApellido());
                emp.setNombre(u.getNombre());
                emp.setTelefono(u.getTelefono());
                emp.setDireccion(u.getDireccion());
                emp.setFecha_nacimiento(u.getFecha_nacimiento());
                emp.setObservacion(u.getObservacion());
                emp.setDias_trabajo(u.getDias_trabajo());
                emp.setSueldo(u.getSueldo());

                return new ResponseEntity<>(empleadoService.save(emp), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Empleado> eliminarEmpleado(@PathVariable Integer id) {
        empleadoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
     }