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
@Table(name = "compras")
public class Compra {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     private int idCompra;
     private Distribuidor distribuidor;
     private Factura factura;

    public Compra() {
    }

    public Compra(int idCompra, Distribuidor distribuidor, Factura factura) {
        this.idCompra = idCompra;
        this.distribuidor = distribuidor;
        this.factura = factura;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
     
      @Override
    public String toString() {
        return "compras{" + "idCompra=" + idCompra + ",Distribuidores_idDistribuidores =" + distribuidor + " Facturas_idFactura"+ factura + '}';
    }
}
