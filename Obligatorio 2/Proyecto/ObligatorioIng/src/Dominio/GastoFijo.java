
package Dominio;

import java.io.Serializable;


public class GastoFijo implements Serializable{
    private String nombre;
    private int costo;
    private int mes;
    private int año;

    public GastoFijo(String nombre, int costo, int mes, int año) {
        this.nombre = nombre;
        this.costo = costo;
        this.mes = mes;
        this.año = año;
    }
      
    public GastoFijo() {
        this.nombre = "Sin nombre";
        this.costo = 0;
        this.mes = 0;
        this.año = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    
    
    
    
    
    
    
    
    
}
