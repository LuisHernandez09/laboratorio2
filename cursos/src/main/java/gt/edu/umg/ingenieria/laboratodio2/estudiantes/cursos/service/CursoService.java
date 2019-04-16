/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.service;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.dao.CursoRepository;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */

@Service
public class CursoService {
    @Autowired
    private CursoRepository repositycurso;
     
    public List<Curso> buscarTodos()
    { 
     return (List<Curso>)this.repositycurso.findAll();
    }
    
    
    public Curso crear(Curso cursovar){
        return this.repositycurso.save(cursovar);
    }


}

