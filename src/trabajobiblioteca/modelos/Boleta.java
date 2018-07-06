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
@Table(name = "boleta")
public class Boleta {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
private int idBoleta;
private String folio;
private int precio_neto;
   @Temporal(TemporalType.TIMESTAMP)
private Date fecha_venta;
private MetodoPago metodoPago;

    public Boleta() {
    }

    public Boleta(int idBoleta, String folio, int precio_neto, Date fecha_venta, MetodoPago metodoPago) {
        this.idBoleta = idBoleta;
        this.folio = folio;
        this.precio_neto = precio_neto;
        this.fecha_venta = fecha_venta;
        this.metodoPago = metodoPago;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(int precio_neto) {
        this.precio_neto = precio_neto;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

@Override
    public String toString() {
        return "boleta{" + "idBoleta=" + idBoleta + ", folio=" + folio + ",percio_neto="+ precio_neto + ",fecha_venta="+ fecha_venta+ ",Metodo_de_pago_idMetodo_pago="+ metodoPago+ '}';
    }
    
}
