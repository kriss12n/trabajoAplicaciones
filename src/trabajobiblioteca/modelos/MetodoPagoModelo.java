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
public class MetodoPagoModelo {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public MetodoPagoModelo(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public MetodoPago crearMetodoPago(String nombre){
         // Agregar los datos del Metodo de pago
        MetodoPago MP = new MetodoPago();
        MP.setNombre(nombre);
      // Guardarlos y confirmar en la base de datos   
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(MP);
        this.entityManagger.getTransaction().commit();
        
        return MP;
    }  
}
