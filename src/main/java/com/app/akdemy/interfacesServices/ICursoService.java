package com.app.akdemy.interfacesServices;

import java.util.List;

import com.app.akdemy.entity.Curso;

public interface ICursoService {
    public void saveCurso(Curso curso);
    public List<Curso> getAllCourses();
    public Curso buscarPorId(long id);
    public void deleteCurso(Long id) throws Exception;
}
