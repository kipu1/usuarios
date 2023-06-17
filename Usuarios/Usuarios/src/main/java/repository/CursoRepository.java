/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.repository;
import com.tendencias.app.Usuarios.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS ROG
 */
public interface CursoRepository extends JpaRepository<Curso, Integer> {
    
}
