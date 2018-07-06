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
public class FacturaModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public FacturaModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public Factura crearFactura(String folio , Date fecha_compra , MetodoPago metodoPago){
         // Agregar los datos de factura
        Factura FA = new Factura();
        FA.setFolio(folio);
        FA.setFecha_compra((java.sql.Date) fecha_compra);//ve algo raro
        FA.setMetodoPago(metodoPago);
      
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(FA);
        this.entityManager.getTransaction().commit();
        
        return FA;
    }  
    public boolean eliminarFactura(int idFactura){
        // Encontrar la factura
        Factura FA = this.entityManager.find(Factura.class, idFactura);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(FA);
        this.entityManager.getTransaction().commit();
        return true;
    }
   
    
}
