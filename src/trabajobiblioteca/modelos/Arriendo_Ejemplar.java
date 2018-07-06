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
@Table(name = "arriendo")
public class Arriendo_Ejemplar {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idArriendo;
   private int precio;
   private int cantidad;
   private Ejemplar ejemplar;
   private Arriendo arriendo;

    public Arriendo_Ejemplar() {
    }

    public Arriendo_Ejemplar(int idArriendo, int precio, int cantidad, Ejemplar ejemplar, Arriendo arriendo) {
        this.idArriendo = idArriendo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.ejemplar = ejemplar;
        this.arriendo = arriendo;
    }

    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
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

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Arriendo getArriendo() {
        return arriendo;
    }

    public void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }
   
      @Override
    public String toString() {
        return "arriendo_ejemplares{" + "idArriendo_Ejemplares=" + idArriendo + ", precio=" + precio + ",cantidad="+cantidad +",Ejemplares="+ejemplar +",Arriendo_idArriendo="+arriendo + '}';
    }
}
