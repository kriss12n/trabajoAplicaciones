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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "arriendo")
public class Arriendo {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idArriendo;
   private Cliente cliente; 
   private Trabajador trabajador;
   private int costo;
   private int multa;
   @Temporal(TemporalType.TIMESTAMP)
   private Date fecha_arriendo;
   @Temporal(TemporalType.TIMESTAMP)
   private Date fecha_devolucion;
   @Temporal(TemporalType.TIMESTAMP)
   private Date fecha_entrega;

    public Arriendo() {
    }

    public Arriendo(int idArriendo, Cliente cliente, Trabajador trabajador, int costo, int multa, Date fecha_arriendo, Date fecha_devolucion, Date fecha_entrega) {
        this.idArriendo = idArriendo;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.costo = costo;
        this.multa = multa;
        this.fecha_arriendo = fecha_arriendo;
        this.fecha_devolucion = fecha_devolucion;
        this.fecha_entrega = fecha_entrega;
    }

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public Date getFecha_arriendo() {
        return fecha_arriendo;
    }

    public void setFecha_arriendo(Date fecha_arriendo) {
        this.fecha_arriendo = fecha_arriendo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    @Override
    public String toString() {
        return "arriendo{" + "idArriendo=" + idArriendo + ", Cliente_idCliente=" + cliente + ",Trabajadores_idTabajadore="+trabajador +",costo="+costo +",multa="+multa +",fecha_arriendo="+fecha_arriendo +",fecha_devolucion="+ fecha_devolucion +",fecha_entrega="+fecha_entrega + '}';
    }
}
