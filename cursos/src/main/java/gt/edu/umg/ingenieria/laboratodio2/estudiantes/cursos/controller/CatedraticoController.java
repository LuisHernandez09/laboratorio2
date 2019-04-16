/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.controller;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Catedratico;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Curso;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.service.CatedraticoService;
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
@RequestMapping("/catedratico")
public class CatedraticoController {
    @Autowired
    private CatedraticoService control;
    @GetMapping ("/buscarTodos")
    public List<Catedratico>buscarTodos(){
        return this.control.buscarTodos();
    } 
    
    @PostMapping("/registrar")
    public Catedratico Registrar(@RequestBody(required=true)Catedratico catedraticovar)
    {
        return this.control.registrar(catedraticovar);
    }
    
}

