
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.controller;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Curso;
import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.service.CursoService;
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
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService control;
    @GetMapping("/buscarTodos")
    public List<Curso>buscarTodos(){
        return this.control.buscarTodos();
    } 
    
    @PostMapping("/crear")
    public Curso Crear(@RequestBody(required=true)Curso cursovar)
    {
        return this.control.crear(cursovar);
    }
    
}

