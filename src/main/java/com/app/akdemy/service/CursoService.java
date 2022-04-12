package com.app.akdemy.service;

import java.util.List;

import com.app.akdemy.entity.Curso;
import com.app.akdemy.entity.Estudiante;
import com.app.akdemy.interfacesServices.ICursoService;
import com.app.akdemy.repository.CursoRepository;
import com.app.akdemy.repository.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    @Autowired
    CursoRepository repCurso;


    @Override
    public List<Curso> obtenerTodos() {
        return (List<Curso>) repCurso.findAll();

    }

    @Override
    public Curso buscarPorDescripcion(String descripcion) {
        return repCurso.findByDescripcion(descripcion).get();
    }

    
}
