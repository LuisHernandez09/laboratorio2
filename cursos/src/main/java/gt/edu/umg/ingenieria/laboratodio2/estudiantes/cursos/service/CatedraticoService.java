/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.service;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.dao.CatedraticoRepository;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Catedratico;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */
@Service
public class CatedraticoService {
    @Autowired
    private CatedraticoRepository repositycatedratico;
     
    public List<Catedratico> buscarTodos()
    { 
     return (List<Catedratico>)this.repositycatedratico.findAll();
    }
    
    
    public Catedratico registrar(Catedratico catedraticovar){
        return this.repositycatedratico.save(catedraticovar);
    }

    


}
