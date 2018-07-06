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
@Table(name = "venta_ejemplares")
public class VentaEjemplar {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private int idVenta_Ejemplar;
   private Venta venta;
   private Ejemplar ejemplar;
   private int Cantidad;
   private int precio;

    public VentaEjemplar() {
    }

    public VentaEjemplar(int idVenta_Ejemplar, Venta venta, Ejemplar ejemplar, int Cantidad, int precio) {
        this.idVenta_Ejemplar = idVenta_Ejemplar;
        this.venta = venta;
        this.ejemplar = ejemplar;
        this.Cantidad = Cantidad;
        this.precio = precio;
    }

    public int getIdVenta_Ejemplar() {
        return idVenta_Ejemplar;
    }

    public void setIdVenta_Ejemplar(int idVenta_Ejemplar) {
        this.idVenta_Ejemplar = idVenta_Ejemplar;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
    @Override
    public String toString() {
        return "ventaEjemplar{" + "idVenta_Ejemplar=" + idVenta_Ejemplar + ", Ventas_idVenta=" + venta + "Ejemplare_idEjemplare"+ejemplar + "cantidad"+ Cantidad+ "precio"+precio + '}';
    }
    
}
