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
public class BoletaMetodo {
        private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public BoletaMetodo(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public Boleta crearBoleta(String folio , int  precio_neto, Date fecha_venta, MetodoPago metodoPago ){
         // Agregar los datos de la boleta
        Boleta BO = new Boleta();
        BO.setFolio(folio);
        BO.setPrecio_neto(precio_neto);
        BO.setFecha_venta(fecha_venta);
        BO.setMetodoPago(metodoPago);
       
        
        
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(BO);
        this.entityManager.getTransaction().commit();
        //Confirmamos
        return BO;
    }  
    public boolean eliminarBoleta(int idBoleta){
        // Encontrar la Boleta
        Boleta BO = this.entityManager.find(Boleta.class, idBoleta);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(BO);
        this.entityManager.getTransaction().commit();
        return true;
    }
    
     
}
