/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.laboratodio2.estudiantes.estudiantes.model;

import java.util.Date;
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
@Table(name="estudiante")


public class Estudiante {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private long id; 

@Column(name="nombre_completo")
private String nombreCompleto;

@Column (name="numero_carne")
private String numeroCarne;

@Column (name="fecha_nacimiento")
private Date fechaNacimiento;

@Column (name="telefono")
private String telefono;

@Column (name="direccion")
private String direccion;

@Column (name="correo")
private String correo;

@Column (name="dpi")
private String dpi;

    public Estudiante() {

    }

    public Estudiante(String nombreCompleto, String numeroCarne, Date fechaNacimiento, String telefono, String direccion, String correo, String dpi) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCarne = numeroCarne;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.dpi = dpi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroCarne() {
        return numeroCarne;
    }

    public void setNumeroCarne(String numeroCarne) {
        this.numeroCarne = numeroCarne;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }



}
