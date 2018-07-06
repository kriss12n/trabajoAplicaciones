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
public class EstadoModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public EstadoModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Estado crearEstado(String nombre){
         // Agregar los datos del estado
        Estado ES = new Estado();
        ES.setNombre(nombre);
      // Guardarlos y confirmar en la base de datos   
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(ES);
        this.entityManagger.getTransaction().commit();
        
        return ES;
    }  
}
