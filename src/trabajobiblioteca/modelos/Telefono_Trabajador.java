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
@Table(name = "telefono_trabajador")
public class Telefono_Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idtelefono_Trabajador;
    private  Trabajador trabajador;  
    private String telefono;

    public Telefono_Trabajador() {
    }

    public Telefono_Trabajador(int idtelefono_Trabajador, Trabajador trabajador, String telefono) {
        this.idtelefono_Trabajador = idtelefono_Trabajador;
        this.trabajador = trabajador;
        this.telefono = telefono;
    }

    public int getIdtelefono_Trabajador() {
        return idtelefono_Trabajador;
    }

    public void setIdtelefono_Trabajador(int idtelefono_Trabajador) {
        this.idtelefono_Trabajador = idtelefono_Trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


 
    
    
    @Override
    
    public String toString() {
        return "telefono_trabajador{" + "idtelefono_trabajador=" + idtelefono_Trabajador+",Trabajadores_idTrabajadore="+trabajador  + ", telefono=" + telefono + '}';
    }
}
