/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class LibroModelo {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public LibroModelo(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Libro crearLibro(Idioma idioma, Editorial editorial ,Autor autor,String isbn, String nombre,int numero_paginas, int precio ){
         // Agregar los datos del Libro
        Libro LB = new Libro();
        LB.setIdioma(idioma);
        LB.setEditorial(editorial);
        LB.setAutor(autor);
        LB.setIsbn(isbn);
        LB.setNombre(nombre);
        LB.setNumero_paginas(numero_paginas);
        LB.setPrecio(precio);
        
         // Guardarlos y confirmar en la base de datos
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(LB);
        this.entityManagger.getTransaction().commit();
        
        return LB;
    }  

    public List<Libro> listaLibro() {
        //Buscamos lo que queremos mostrar 
        List<Libro> lista = this.entityManagger.createQuery("SELECT c FROM Cliente c").getResultList();
        //mostramos
        return lista;
    }

    public Libro porId(int id) {
        //buscamos el Libro por su ID
        Libro LB = this.entityManagger.find(Libro.class, id);
        //retornamos el Cliente
        return LB;
    }
    
     public boolean eliminarLibroPorId(int idLibro){
        // Encontrar el Libro
        Libro LB = this.entityManagger.find(Libro.class, idLibro);
        
        // Eliminar
        this.entityManagger.getTransaction().begin();
        this.entityManagger.remove(LB);
        this.entityManagger.getTransaction().commit();
        return true;
    }
     
    
}
