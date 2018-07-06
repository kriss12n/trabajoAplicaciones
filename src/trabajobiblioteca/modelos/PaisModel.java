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
public class PaisModel {
     
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public PaisModel(){
        // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Region crearPais(String nombre){
         // Agregar los datos del Pais
        Region PS = new Region();
        PS.setNombre(nombre);
        // Guardarlos y confirmar en la base de datos
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(PS);
        this.entityManagger.getTransaction().commit();
        
        return PS;
    }  
}
