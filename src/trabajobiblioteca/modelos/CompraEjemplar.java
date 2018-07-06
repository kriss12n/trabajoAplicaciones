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
@Table(name = "compras_ejemplares")
public class CompraEjemplar {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int idCompras_Ejemplares;
      private int precio;
      private int cantidad;
      private Compra compra;
      private Ejemplar  ejemplar;

    public CompraEjemplar() {
    }

    public CompraEjemplar(int idCompras_Ejemplares, int precio, int cantidad, Compra compra, Ejemplar ejemplar) {
        this.idCompras_Ejemplares = idCompras_Ejemplares;
        this.precio = precio;
        this.cantidad = cantidad;
        this.compra = compra;
        this.ejemplar = ejemplar;
    }

    public int getIdCompras_Ejemplares() {
        return idCompras_Ejemplares;
    }

    public void setIdCompras_Ejemplares(int idCompras_Ejemplares) {
        this.idCompras_Ejemplares = idCompras_Ejemplares;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
      
      @Override
    public String toString() {
        return "compras_ejemplares{" + "idCompras_Ejemplares=" + idCompras_Ejemplares + ",precio =" + precio + " cantidad"+ cantidad + ",Compras_idCompra ="+ compra+ ",Ejemplares_idEjemplare ="+ ejemplar+ '}';
    }
      
}
