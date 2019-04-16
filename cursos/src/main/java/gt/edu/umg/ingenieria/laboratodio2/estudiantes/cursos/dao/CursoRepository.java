/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.dao;

import gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luis
 */
@Repository
public interface CursoRepository extends CrudRepository<Curso,Long>{
    
}
