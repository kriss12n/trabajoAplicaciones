/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import com.sun.security.ntlm.Client;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class VentaModel {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public VentaModel() {
        // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public Venta registrarVenta( Date fecha, Boleta boleta,Cliente cliente,Trabajador trabajador){
        // Agregar los datos de la venta
        Venta venta = new Venta();
        venta.setFecha(fecha);
        venta.setBoleta(boleta);
        venta.setClientes(cliente);
        venta.setTrabajador(trabajador);
        //Guardamos y confirmamos
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(venta);
        this.entityManager.getTransaction().commit();
        
        return venta;
    }
    
    public boolean eliminarVentaPorId(int idVenta){
        // Encontrar la venta
        Venta venta = this.entityManager.find(Venta.class, idVenta);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(venta);
        this.entityManager.getTransaction().commit();
        return true;
    } 
}
