/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author ASUS ROG
 */
@Data
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int id_persona;

    @Size(min = 2, max = 45, message = "El apellido debe tener entre 2 y 20 caracteres")
    @NotBlank(message = "El apellido esta en blanco")
    @Column(name = "apellido")
    private String apellido;
 
    
   @Size(min = 2, max = 45, message = "El nombre debe tener entre 2 y 20 caracteres")
    @NotBlank(message = "El nombre esta blanco")
    @Column(name = "nombre")
    private String nombre;

     @Size(min = 2, max = 15, message = "El telefono debe tener entre 2 y 15 caracteres")
    @NotBlank(message = "El telefono esta blanco")
    @Column(name = "telefono")
    private String telefono;
     
     
      @Size(min = 2, max = 45, message = "La direccion debe tener entre 2 y 45 caracteres")
    @NotBlank(message = "La direccion esta blanco")
    @Column(name = "direccion")
    private String direccion;
      
         
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    
      
    
    @NotBlank(message = "La Observacion esta blanco")
    @Column(name = "Observacion")
    private String Observacion;
       
       
        
    @NotBlank(message = "El dias de trabajo esta blanco")
    @Column(name = "dias_trabajo")
    private String dias_trabajo;
        
    @Column(name = "sueldo")
    private int sueldo;   
    
    
     
    
    
}
