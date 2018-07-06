/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.controladores;

import java.util.List;
import trabajobiblioteca.modelos.Cliente;
import trabajobiblioteca.modelos.ClienteModelo;

/**
 *
 * @author kriss
 */
public class ClienteController {
    
    private ClienteModelo clienteModelo;
    
    public ClienteController() {
        clienteModelo = new ClienteModelo();
    }
 
    public List<Cliente> listaClientes(){
        List<Cliente> lista = this.clienteModelo.listaCliente();
        
        return lista;
    }
    
     public Cliente crearCliente(String rut ,String nombre, String apellidoPaterno, String apellidoMaterno){
        Cliente cliente = this.clienteModelo.crearCliente(rut ,nombre, apellidoPaterno, apellidoMaterno);
        
        return cliente;
    }
    
    public Cliente porId(int id){
        Cliente cliente = this.clienteModelo.porId(id);
        
        return cliente;
    }
}


    

