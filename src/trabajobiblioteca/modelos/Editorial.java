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
@Table(name = "editoriales")
public class Editorial {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idEditoriable;
    private String nombre;   

    public Editorial() {
    }

    public Editorial(int idEditoriable, String nombre) {
        this.idEditoriable = idEditoriable;
        this.nombre = nombre;
    }

    public int getIdEditoriable() {
        return idEditoriable;
    }

    public void setIdEditoriable(int idEditoriable) {
        this.idEditoriable = idEditoriable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     @Override
    public String toString() {
        return "editoriales{" + "idEditoriable=" + idEditoriable + ", nombre=" + nombre +  '}';
    }
}
