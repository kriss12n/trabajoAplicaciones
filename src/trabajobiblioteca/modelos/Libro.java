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
@Table(name = "libros")
public class Libro {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idLibro;
     private Idioma idioma;
     private Editorial editorial;
     private Autor autor;
     private String isbn;
     private String nombre;
     private int numero_paginas;
     private int precio;

    public Libro() {
    }

    public Libro(int idLibro, Idioma idioma, Editorial editorial, Autor autor, String isbn, String nombre, int numero_paginas, int precio) {
        this.idLibro = idLibro;
        this.idioma = idioma;
        this.editorial = editorial;
        this.autor = autor;
        this.isbn = isbn;
        this.nombre = nombre;
        this.numero_paginas = numero_paginas;
        this.precio = precio;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
     
     @Override
    public String toString() {
        return "libros{" + "idLibro=" + idLibro + ", Idiomas_idIdioma=" + idioma + ",Editoriales_idEditoriale="+ editorial+",Autor_idAutor="+autor +",isbn="+ isbn+",nombre="+nombre +",numero_paginas="+ numero_paginas+",precio="+ precio+'}';
    }
    
}
