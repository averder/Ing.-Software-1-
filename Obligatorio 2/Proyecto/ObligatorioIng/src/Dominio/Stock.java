package Dominio;

import java.io.Serializable;

public class Stock implements Serializable {
    private Producto producto;
    private int enStock;

    public Stock(Producto producto, int enStock) {
        this.producto = producto;
        this.enStock = enStock;
    }
    
    public Stock(){
        
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getEnStock() {
        return enStock;
    }

    public void setEnStock(int enStock) {
        this.enStock = enStock;
    }
    
    @Override
    public boolean equals (Object o){
        return this.getProducto().equals(((Stock)o).getProducto());
    
    }
    
    @Override
    public String toString() {
        return this.producto.getNombre() + ", Stock minimo: " + this.producto.getStockMinimo()
                + ", Stock: " + this.enStock;
    }
    
    
}
