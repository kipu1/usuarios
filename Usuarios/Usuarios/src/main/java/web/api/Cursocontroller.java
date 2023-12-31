/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.controller;

import com.tendencias.app.Usuarios.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author ASUS ROG
 */
@RestController
@RequestMapping("/api/cursos")
public class Cursocontroller {
   @Autowired
   private CursoRepository cursoRepository;
    
    @GetMapping
    List<Curso> getALL(){
        return cursoRepository.findAll();
    }
    @PostMapping
    Curso create(@RequestBody Curso curso){
      return cursoRepository.save(curso);
      
    }
}
