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
public class EditorialModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public EditorialModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Editorial crearEditorial(String nombre){
         // Agregar los datos de la Editorial
        Editorial ET = new Editorial();
        ET.setNombre(nombre);
      // Guardarlos y confirmar en la base de datos   
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(ET);
        this.entityManagger.getTransaction().commit();
        
        return ET;
    }  
}
