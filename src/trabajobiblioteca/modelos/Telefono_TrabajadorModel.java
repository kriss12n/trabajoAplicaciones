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
public class Telefono_TrabajadorModel {
   
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public Telefono_TrabajadorModel() {
        // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public Telefono_Trabajador registrarTelefono(Trabajador trabajador, String Telefono){
        // Agregar los datos del Telefono del Trabajador
        Telefono_Trabajador TT = new Telefono_Trabajador();
        TT.setTrabajador((Trabajador)trabajador);
        TT.setTelefono(Telefono);
        
        //Guardamos y confirmamos
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(TT);
        this.entityManager.getTransaction().commit();
        
        return TT;
    }
    
    public boolean eliminarVentaPorId(int idVenta){
        // Encontrar la venta
        Telefono_Trabajador s = this.entityManager.find(Telefono_Trabajador.class, idVenta);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(s);
        this.entityManager.getTransaction().commit();
        return true;
    }


}
