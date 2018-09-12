
package Dominio;

import java.io.Serializable;


public class Producto implements Serializable{
   
    private String nombre;
    private int stockMinimo;

    public Producto(String nombre, int stockMinimo) {
        this.nombre = nombre;
        this.stockMinimo = stockMinimo;
    }

   public Producto(){
       this.nombre= ""; 
       this.stockMinimo=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    
@Override
    public boolean equals (Object o){
        return this.getNombre().equals(((Producto)o).getNombre()); 
    }

    @Override
    public String toString() {
        return  this.nombre + ", Stock Minimo: " + this.stockMinimo;
    }
  
}
