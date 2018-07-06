/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class TrabajadorModelo {
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public TrabajadorModelo(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Trabajador crearTrabajador(String rut, String nombre,String apellido_paterno,String apellido_materno ){
          // Agregar los datos del cliente
        Trabajador TB = new Trabajador();
          TB.setRut(rut);
        TB.setNombre(nombre);
        TB.setApellido_paterno(apellido_paterno);
        TB.setApellido_materno(apellido_materno);
        // Guardarlos y confirmar en la base de datos
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(TB);
        this.entityManagger.getTransaction().commit();
        
        return TB;
    }  

    public List<Trabajador> listaTrabajador() {
        //Buscamos lo que queremos mostrar 
        List<Trabajador> lista = this.entityManagger.createQuery("SELECT c FROM Cliente c").getResultList();
         //mostramos
        return lista;
    }

    public Trabajador porId(int id) {
         //Buscamos el Trabajador por su ID
        Trabajador trabajador = this.entityManagger.find(Trabajador.class, id);
        //retornamos el Cliente
        return trabajador;
    }
    
     public boolean eliminarTrabajadorPorId(int idtrabajador){
        // Encontrar la venta
        Trabajador TB = this.entityManagger.find(Trabajador.class, idtrabajador);
        
        // Eliminar
        this.entityManagger.getTransaction().begin();
        this.entityManagger.remove(TB);
        this.entityManagger.getTransaction().commit();
        return true;
    }
    
    
}
