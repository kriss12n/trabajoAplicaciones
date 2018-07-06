/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "trabajadores")
public class Trabajador {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrabajador; 
    private String rut;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;

    public Trabajador() {
    }

    public Trabajador(int idTrabajador, String rut, String nombre, String apellido_paterno, String apellido_materno) {
        this.idTrabajador = idTrabajador;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

  

    

  @Override
    public String toString() {
        return "trabajadores{" + "idTrabajador=" + idTrabajador +", rut=" + rut + ", nombre=" + nombre +   ", apellido_paterno=" + apellido_paterno +",apellido_materno=" + apellido_materno + '}';
    }
    
}
