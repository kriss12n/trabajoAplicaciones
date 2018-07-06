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
public class CompraEjemplarModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public CompraEjemplarModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public CompraEjemplar crearCompraEjemplar(int precio, int cantidad, Compra compra, Ejemplar ejemplar){
         // Agregar los datos de compra  
        CompraEjemplar CEP = new CompraEjemplar();
        CEP.setPrecio(precio);
        CEP.setCantidad(cantidad);
        CEP.setCompra(compra);
        CEP.setEjemplar(ejemplar);
        
        
        
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(CEP);
        this.entityManager.getTransaction().commit();
        
        return CEP;
    }  
     public boolean eliminarEjemplares(int idComprarEjemplar){
        // Encontrar la Compra del ejemplar
        CompraEjemplar CEP = this.entityManager.find(CompraEjemplar.class, idComprarEjemplar);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(CEP);
        this.entityManager.getTransaction().commit();
        return true;
    }
   
    
            } 

