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
@Table(name = "distribuidores")
public class Distribuidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistribuidores;
    private Region region;
    private Pais pais;
    private String rut;
    private String nombre;
    private String calle;
    private String numero;
    private String ciudad;
    private String comuna;
    private String telefono;
      @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_inscripcion;

    public Distribuidor() {
    }

    public Distribuidor(int idDistribuidores, Region region, Pais pais, String rut, String nombre, String calle, String numero, String ciudad, String comuna, String telefono, Date fecha_inscripcion) {
        this.idDistribuidores = idDistribuidores;
        this.region = region;
        this.pais = pais;
        this.rut = rut;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.telefono = telefono;
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public int getIdDistribuidores() {
        return idDistribuidores;
    }

    public void setIdDistribuidores(int idDistribuidores) {
        this.idDistribuidores = idDistribuidores;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

  
  
    
   public String toString() {
        return "distribuidores{" + "idDistribuidores=" + idDistribuidores + ", Regiones_idRegione=" + region + ", Pais_idPai=" + pais + ", rut=" + rut +",nombre="+nombre+",calle="+calle+",numero="+numero+ ",ciudad="+ciudad+",comuna="+comuna +",telefono="+ telefono+",fecha_inscripcion="+ fecha_inscripcion+   '}';
    } 
    
}
