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
public class ClienteModelo {
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagger;
    
    public ClienteModelo(){
         // Establecemos conexion con la base de datos
        this.entityManagerFactory = Persistence.createEntityManagerFactory("TrabajoBibliotecaPU");
        this.entityManagger = this.entityManagerFactory.createEntityManager();
        
    }
    public Cliente crearCliente(String rut, String nombre,String apellido_paterno,String apellido_materno ){
         // Agregar los datos del cliente
        Cliente CL = new Cliente();
        CL.setRut(rut);
        CL.setNombre(nombre);
        CL.setApellido_paterno(apellido_paterno);
        CL.setApellido_materno(apellido_materno);
         // Guardarlos y confirmar en la base de datos
        this.entityManagger.getTransaction().begin();
        this.entityManagger.persist(CL);
        this.entityManagger.getTransaction().commit();
        
        return CL;
    }  

    public List<Cliente> listaCliente() {
        //Buscamos lo que queremos mostrar 
        List<Cliente> lista = this.entityManagger.createQuery("SELECT c FROM Cliente c").getResultList();
        //mostramos
        return lista;
    }

    public Cliente porId(int id) {
        //buscamos el Cliente por su ID
        Cliente cliente = this.entityManagger.find(Cliente.class, id);
        //retornamos el Cliente
        return cliente;
    }
    
     public boolean eliminarClientePorId(int idcliente){
        // Encontrar el Cliente
        Cliente CL = this.entityManagger.find(Cliente.class, idcliente);
        
        // Eliminar
        this.entityManagger.getTransaction().begin();
        this.entityManagger.remove(CL);
        this.entityManagger.getTransaction().commit();
        return true;
    }
}
