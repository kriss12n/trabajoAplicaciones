/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import java.util.Date;
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
@Table(name = "ventas")
public class Venta {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idVenta;
  private Date fecha; 
  
  private Boleta boleta;
  private Cliente clientes;
  private Trabajador trabajador;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha, Boleta boleta, Cliente clientes, Trabajador trabajador) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.boleta = boleta;
        this.clientes = clientes;
        this.trabajador = trabajador;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boleta getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
  
   @Override
    public String toString() {
        return "ventas{" + "idVenta=" + idVenta + ", fecha=" + fecha + ",Boleta_idBoleta="+ boleta+ ",Clientes_idCliente="+ clientes+ ",Trabajadores_idTrabajadore="+ trabajador+ '}';
    }
  
}
