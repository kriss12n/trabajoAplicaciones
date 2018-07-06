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
@Table(name = "regiones")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idRegione;
    private String nombre;

    public Region() {
    }

    public Region(int idRegione, String nombre) {
        this.idRegione = idRegione;
        this.nombre = nombre;
    }

    public int getIdRegione() {
        return idRegione;
    }

    public void setIdRegione(int idRegione) {
        this.idRegione = idRegione;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     @Override
    public String toString() {
        return "regiones{" + "idRegion=" + idRegione + ", nombre=" + nombre + '}';
    }
    
}
