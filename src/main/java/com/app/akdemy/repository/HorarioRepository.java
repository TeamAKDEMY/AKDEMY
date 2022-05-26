package com.app.akdemy.repository;

import java.util.List;

import com.app.akdemy.entity.Curso;
import com.app.akdemy.entity.Estudiante;
import com.app.akdemy.entity.HorarioCurso;
import com.app.akdemy.entity.Profesor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends CrudRepository<HorarioCurso, Long> {
    public List<HorarioCurso> findByCurso(Curso curso);

    public List<HorarioCurso> findByProfesor(Profesor profesor);
}
