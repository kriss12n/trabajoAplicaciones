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
import static trabajobiblioteca.modelos.Distribuidor_.pais;
import static trabajobiblioteca.modelos.Distribuidor_.region;

/**
 *
 * @author andre
 */
public class DistribuidorModelo {
    
       private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public DistribuidorModelo() {
        // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public Distribuidor registrarDistribuidor(Region region ,Pais pais , String rut, String nombre,String calle, String numero,String ciudad,String comuna,String telefono,Date fecha_inscripcion ){
        // Agregar los datos del Distribuidor
        Distribuidor DR = new Distribuidor();
        DR.setRegion(region);
        DR.setPais(pais);
        DR.setRut(rut);
        DR.setNombre(nombre);
        DR.setCalle(calle);
        DR.setNumero(numero);
        DR.setCiudad(ciudad);
        DR.setComuna(comuna);
        DR.setTelefono(telefono);
        DR.setFecha_inscripcion(fecha_inscripcion);
        
        //Guardamos y confirmamos
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(DR);
        this.entityManager.getTransaction().commit();
        
        return DR;
    }
    
    public boolean eliminarVentaPorId(int idVenta){
        // Encontrar la Distribuidor
        Distribuidor DR = this.entityManager.find(Distribuidor.class, idVenta);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(DR);
        this.entityManager.getTransaction().commit();
        return true;
    }
    
}
