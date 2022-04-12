package com.app.akdemy.interfacesServices;

import java.util.List;

import com.app.akdemy.entity.Estudiante;

public interface IEstudianteService {
    public void guardarEstudiante(Estudiante estudiante);
    public List<Estudiante> buscarPorCurso(int numCurso);
}
