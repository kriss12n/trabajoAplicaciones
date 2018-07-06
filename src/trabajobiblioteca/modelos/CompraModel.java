/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class CompraModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public CompraModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public Compra crearCompra(Distribuidor distribuidor, Factura  factura ){
         // Agregar los datos de Compra
        Compra CM = new Compra();
        CM.setDistribuidor(distribuidor);
        CM.setFactura(factura);
  
        
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(CM);
        this.entityManager.getTransaction().commit();
        
        return CM;
    }  
    public boolean eliminarEjemplares(int idCompra){
        // Encontrar la Compra
        Compra CM = this.entityManager.find(Compra.class, idCompra);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(CM);
        this.entityManager.getTransaction().commit();
        return true;
    }
   
    
            } 

