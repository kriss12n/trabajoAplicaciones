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
public class ArriendoModel {
    
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public ArriendoModel(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public Arriendo crearEjemplares(Cliente cliente , Trabajador trabajador, int costo, int multa, Date fecha_arriendo, Date fecha_devolucion, Date fecha_entrega){
         // Agregar los datos del Arriendo
        Arriendo EJM = new Arriendo();
        EJM.setCliente(cliente);
        EJM.setTrabajador(trabajador);
        EJM.setCosto(costo);
        EJM.setMulta(multa);
        EJM.setFecha_arriendo(fecha_arriendo);
        EJM.setFecha_devolucion(fecha_devolucion);
        EJM.setFecha_entrega(fecha_entrega);
        
      // Guardarlos y confirmar en la base de datos   
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(EJM);
        this.entityManager.getTransaction().commit();
        
        return EJM;
    }  
    public boolean eliminarArriendo(int idArriendo){
        // Encontrar la Arriendo
        Arriendo EJM = this.entityManager.find(Arriendo.class, idArriendo);        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(EJM);
        this.entityManager.getTransaction().commit();
        return true;
    }
    
    
}
