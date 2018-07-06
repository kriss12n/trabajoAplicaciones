/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.controladores;
        import trabajobiblioteca.modelos.Trabajador;
        import trabajobiblioteca.modelos.TrabajadorModelo;
import java.util.List;

/**
 *
 * @author kriss
 */
public class TrabajadorController {
    
    
    private TrabajadorModelo trabajadorModelo;
    
    public TrabajadorController(){
    
        trabajadorModelo = new TrabajadorModelo();
   
}
    
    public List<Trabajador> listaTrabajadores(){
        List<Trabajador> lista = this.trabajadorModelo.listaTrabajador();
        
        return lista;
    
    
}
    
    
     public Trabajador crearTrabajador(String rut,String nombre, String apellidoPaterno, String apellidoMaterno){
        Trabajador trabajador = this.trabajadorModelo.crearTrabajador(rut,nombre, apellidoPaterno, apellidoMaterno);
        
        return trabajador;
    }
     public Trabajador porId(int id){
        Trabajador trabajador = this.trabajadorModelo.porId(id);
        
        return trabajador;
    }
    
    
    
}