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
public class IdiomaModel {
 private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public IdiomaModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Idioma crearIdioma(String nombre){
         // Agregar los datos de Idioma
        Idioma IA = new Idioma();
        IA.setNombre(nombre);
      // Guardarlos y confirmar en la base de datos   
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(IA);
        this.entityManagger.getTransaction().commit();
        
        return IA;
    }     
}
