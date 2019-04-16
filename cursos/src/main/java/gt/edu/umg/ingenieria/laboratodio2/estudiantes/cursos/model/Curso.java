/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.cursos.model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
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
@Table(name="curso")
public class Curso {
    @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Long id; 

@Column(name="nombre")
private String nombre;

@Column(name="descripcion")
private String descripcion;

@Column(name="creditos")
private int creditos;

@Column(name="semestre")
private int semetre;

    public Curso() {
    }

    public Curso(String nombre, String descripcion, int creditos, int semetre) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.semetre = semetre;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemetre() {
        return semetre;
    }

    public void setSemetre(int semetre) {
        this.semetre = semetre;
    }


    




}
