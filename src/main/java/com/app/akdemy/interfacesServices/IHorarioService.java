package com.app.akdemy.interfacesServices;

import java.util.List;

import com.app.akdemy.entity.HorarioCurso;

public interface IHorarioService {
    public List<HorarioCurso> obtenerTodos();
    public HorarioCurso obtenerPorId(long id);
    public void guardarHorario(HorarioCurso horario);
    public void eliminarHorario(long idHorario);
    public List<HorarioCurso> obtenerPorCurso(long idCurso);
}