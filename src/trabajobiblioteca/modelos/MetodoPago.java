/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "metodo_de_pago")
public class MetodoPago {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int idMetodo_pago;
      private String nombre;

    public MetodoPago() {
    }

    public MetodoPago(int idMetodo_pago, String nombre) {
        this.idMetodo_pago = idMetodo_pago;
        this.nombre = nombre;
    }

    public int getIdMetodo_pago() {
        return idMetodo_pago;
    }

    public void setIdMetodo_pago(int idMetodo_pago) {
        this.idMetodo_pago = idMetodo_pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
       @Override
    public String toString() {
        return "MetodoPago{" + "idMetodo_pago=" + idMetodo_pago + ", nombre=" + nombre +  '}';
    }
    
    
}
