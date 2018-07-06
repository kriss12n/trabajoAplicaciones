/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobiblioteca.modelos;

import java.sql.Date;
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
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idFactura;
    private String folio;
    
   @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_compra;
    private MetodoPago metodoPago;

    public Factura() {
    }

    public Factura(int idFactura, String folio, Date fecha_compra, MetodoPago metodoPago) {
        this.idFactura = idFactura;
        this.folio = folio;
        this.fecha_compra = fecha_compra;
        this.metodoPago = metodoPago;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

   
    
     @Override
    public String toString() {
        return "facturas{" + "idFactura=" + idFactura + ", folio=" + folio + " ,fecha_compra="+ fecha_compra + ",Metodo_de_pago_idMetodo_de_pago="+metodoPago+'}';
    }
}
