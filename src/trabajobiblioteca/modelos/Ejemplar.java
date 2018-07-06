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
@Table(name = "ejemplares")
public class Ejemplar {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idEjemplar;   
  private Libro libro;   
  private Estado estado;
  private String numero_serie;

    public Ejemplar() {
    }

    public Ejemplar(int idEjemplar, Libro libro, Estado estado, String numero_serie) {
        this.idEjemplar = idEjemplar;
        this.libro = libro;
        this.estado = estado;
        this.numero_serie = numero_serie;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }
  
    @Override
    public String toString() {
        return "ejemplares{" + "idEjemplar=" + idEjemplar + ", Libros_idLibros=" + libro + ",Estado_idEstado="+ estado+",numero_serie="+numero_serie+ '}';
    }
    
}
