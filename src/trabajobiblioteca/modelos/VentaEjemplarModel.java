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
public class VentaEjemplarModel {
      private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public VentaEjemplarModel() {
        // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public VentaEjemplar registrarVentaEjemplar( Venta venta, Ejemplar ejemplar,int cantidad, int precio){
        // Agregar los datos de la venta Ejemplar
        VentaEjemplar ventas = new VentaEjemplar();
        ventas.setVenta(venta);
        ventas.setIdVenta_Ejemplar(cantidad);
        ventas.setCantidad(cantidad);
        ventas.setPrecio(precio);
       
  
        //Guardamos y confirmamos
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(ventas);
        this.entityManager.getTransaction().commit();
        
        return ventas;
    }
    
    public boolean eliminarVentaPorId(int idVenta){
        // Encontrar la venta
        VentaEjemplar ventas = this.entityManager.find(VentaEjemplar.class, idVenta);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(ventas);
        this.entityManager.getTransaction().commit();
        return true;
    } 
    
}
