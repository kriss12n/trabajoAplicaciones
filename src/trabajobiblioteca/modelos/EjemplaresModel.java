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
public class EjemplaresModel {
    
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public EjemplaresModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public Ejemplar crearEjemplares(Libro libro , Estado estado, String numero_serie){
         // Agregar los datos del Ejemplar
        Ejemplar EJ = new Ejemplar();
        EJ.setLibro(libro);
        EJ.setEstado(estado);
        EJ.setNumero_serie(numero_serie);
        
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(EJ);
        this.entityManager.getTransaction().commit();
        
        return EJ;
    }  
    public boolean eliminarEjemplares(int idEjemplar){
        // Encontrar la venta
        Ejemplar EJ = this.entityManager.find(Ejemplar.class, idEjemplar);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(EJ);
        this.entityManager.getTransaction().commit();
        return true;
    }
   
}
