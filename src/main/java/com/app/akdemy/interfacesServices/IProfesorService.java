package com.app.akdemy.interfacesServices;

import java.util.List;
import com.app.akdemy.entity.Profesor;

public interface IProfesorService {
    public void saveProfesor(Profesor profesor);
    public List<Profesor> getAllProfesors();
}
