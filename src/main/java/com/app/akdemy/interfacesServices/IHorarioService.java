package com.app.akdemy.interfacesServices;

import java.util.List;

import com.app.akdemy.entity.Curso;
import com.app.akdemy.entity.HorarioCurso;
import com.app.akdemy.entity.MateriaGrado;
import com.app.akdemy.entity.Profesor;

public interface IHorarioService {
    public List<HorarioCurso> obtenerTodos();

    public HorarioCurso obtenerPorId(long id);

    public void guardarHorario(HorarioCurso horario);

    public void eliminarHorario(long idHorario);

    public List<HorarioCurso> obtenerPorCurso(long idCurso);

    public List<HorarioCurso> obtenerPorProfesor(Profesor Profesor);
    public Profesor getProfesorByCursoAndMateria(Curso curso, MateriaGrado materia);
}
