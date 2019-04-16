/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.service;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.dao.EstudianteRepository;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */
@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository reposityestudiante;
     
    public List<Estudiante> buscarTodos()
    { 
     return (List<Estudiante>)this.reposityestudiante.findAll();
    }
    public Estudiante registrar(Estudiante estudinvar){
        return this.reposityestudiante.save(estudinvar);
    }
    }