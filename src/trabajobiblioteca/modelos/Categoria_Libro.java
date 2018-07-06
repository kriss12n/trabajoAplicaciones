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
@Table(name = "categoria_libros")
public class Categoria_Libro {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int idCategoria_libro;
    private Libro libro;
    private Categoria categoria;

    public Categoria_Libro() {
    }

    public Categoria_Libro(int idCategoria_libro, Libro libro, Categoria categoria) {
        this.idCategoria_libro = idCategoria_libro;
        this.libro = libro;
        this.categoria = categoria;
    }

    public int getIdCategoria_libro() {
        return idCategoria_libro;
    }

    public void setIdCategoria_libro(int idCategoria_libro) {
        this.idCategoria_libro = idCategoria_libro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "autor{" + "idCategoria_Libro=" + idCategoria_libro + ", Libros_idLibros=" + libro + ",Categoria_idCategoria="+ categoria+ '}';
    }
}
