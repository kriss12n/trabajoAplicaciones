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
public class Arriendo_EjemplarModel {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public Arriendo_EjemplarModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public Arriendo_Ejemplar crearArriendoEjemplares(int precio , int cantidad, Ejemplar ejemplar, Arriendo arriendo){
         // Agregar los datos del Arriendo
        Arriendo_Ejemplar AE = new Arriendo_Ejemplar();
        AE.setPrecio(precio);
        AE.setCantidad(cantidad);
        AE.setEjemplar(ejemplar);
        AE.setArriendo(arriendo);
        
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(AE);
        this.entityManager.getTransaction().commit();
        
        return AE;
    }  
    public boolean eliminarEjemplares(int idEjemplar){
        // Encontrar la Arriendo
        Arriendo_Ejemplar AE = this.entityManager.find(Arriendo_Ejemplar.class, idEjemplar);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(AE);
        this.entityManager.getTransaction().commit();
        return true;
    }
   
}
