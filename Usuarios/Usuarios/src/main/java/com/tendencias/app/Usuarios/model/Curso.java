/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.Usuarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author ASUS ROG
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Curso {
    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String titulo;
    private String imagenPath;
    private String imageUrl;
    @Transient
    private String imagenUrl; 
}
