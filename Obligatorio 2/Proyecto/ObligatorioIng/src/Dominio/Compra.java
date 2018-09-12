package Dominio;

import java.io.Serializable;

public class Compra implements Serializable {

    private Producto productoCompra;
    private int costoTotal;
    private int unidades;
    private int costoUnitario;
    private int mes;
    private int año;

    public Compra(Producto productoCompra, int costoT, int costoU,
            int cantidad, int mes, int año) {
        this.productoCompra = productoCompra;
        this.costoTotal = costoT;
        this.costoUnitario = costoU;
        this.unidades = cantidad;
        this.mes = mes;
        this.año = año;
    }
    
    public Compra(){
        
    }

    public Producto getProductoCompra() {
        return productoCompra;
    }

    public void setProductoCompra(Producto productoCompra) {
        this.productoCompra = productoCompra;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(int costoUnitario) {
        this.costoUnitario = costoUnitario;
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
