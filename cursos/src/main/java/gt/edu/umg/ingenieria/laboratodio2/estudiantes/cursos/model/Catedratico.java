
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author luis
 */
@Entity
@Table(name="catedratico")
public class Catedratico {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Long id; 

@Column(name="nombre")
private String nombre;

@Column(name="apellidos")
private String apellidos;


@Column(name="codigo_catedratico")
private String codigoCatedratico;

    public Catedratico() {
    }

    public Catedratico(String nombre, String apellidos, String codigoCatedratico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigoCatedratico = codigoCatedratico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(String codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }




}
