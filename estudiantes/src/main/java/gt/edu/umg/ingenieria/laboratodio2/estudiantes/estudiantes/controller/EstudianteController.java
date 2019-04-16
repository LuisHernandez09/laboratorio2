/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.controller;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.model.Estudiante;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luis
 */

@RestController
@RequestMapping("/estudiantes")

public class EstudianteController {
    @Autowired
     
    private EstudianteService control;
    @GetMapping("/buscarTodos")
    
    public List<Estudiante>buscarTodos(){
        return this.control.buscarTodos();
    } 
    
    @PostMapping("/registrar")
    public Estudiante registrar(@RequestBody(required=true)Estudiante estudenvar)
    {
        return this.control.registrar(estudenvar);
    }
    
}
