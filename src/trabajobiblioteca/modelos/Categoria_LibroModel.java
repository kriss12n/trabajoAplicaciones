/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class Categoria_LibroModel {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public Categoria_LibroModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Categoria_Libro crearAutor(Libro libro , Categoria categoria){
         // Agregar los datos del Autor
        Categoria_Libro CLM = new Categoria_Libro();
        CLM.setLibro(libro);
        CLM.setCategoria(categoria);
      // Guardarlos y confirmar en la base de datos   
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(CLM);
        this.entityManagger.getTransaction().commit();
        
        return CLM;
    }  
    
     public boolean eliminarClientePorId(int idCategoria_Libro){
        // Encontrar el Cliente
        Categoria_Libro CLM = this.entityManagger.find(Categoria_Libro.class, idCategoria_Libro);
        
        // Eliminar
        this.entityManagger.getTransaction().begin();
        this.entityManagger.remove(CLM);
        this.entityManagger.getTransaction().commit();
        return true;
    }
    
}

