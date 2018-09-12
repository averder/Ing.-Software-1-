package Dominio;

import java.util.Calendar;
import java.io.Serializable;
import java.util.ArrayList;


public class Sistema implements Serializable {

    private ArrayList<GastoFijo> listaGastosFijos;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Compra> listaCompras;
    private ArrayList<Stock> listaStocks;

    public Sistema(ArrayList<GastoFijo> listaGastosFijos, ArrayList<Producto> listaProductos, ArrayList<Compra> listaCompras, ArrayList<Stock> listaStocks) {
        this.listaGastosFijos = listaGastosFijos;
        this.listaProductos = listaProductos;
        this.listaStocks = listaStocks;
        this.listaCompras = listaCompras;
    }

    public Sistema() {
        this.listaGastosFijos = new ArrayList<GastoFijo>();
        this.listaProductos = new ArrayList<Producto>();
        this.listaStocks = new ArrayList<Stock>();
        this.listaCompras = new ArrayList<Compra>();

    }

    public ArrayList<GastoFijo> getListaGastosFijos() {
        return listaGastosFijos;
    }

    public void setListaGastosFijos(ArrayList<GastoFijo> listaGastosFijos) {
        this.listaGastosFijos = listaGastosFijos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductosStock(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public ArrayList<Stock> getListaStocks() {
        return listaStocks;
    }

    public void setListaStocks(ArrayList<Stock> listaStocks) {
        this.listaStocks = listaStocks;
    }

    public boolean quitarProducto(Stock unStock) {

        boolean resultado = false;

        int pos = this.getListaStocks().indexOf(unStock);     //lo busco en el equals con el nombre de producto
        if (pos != -1) {
            Stock existente = this.getListaStocks().get(pos); //me quedo con el que existe en la lista
            int cantidad = existente.getEnStock();
            if (cantidad == 1) {
                this.getListaStocks().remove(existente);
                resultado = true;
            } else {
                existente.setEnStock(cantidad - 1);
            }
        }
        return resultado;
    }

    public void registrarGastoFijo(GastoFijo unGasto) {
        this.listaGastosFijos.add(unGasto);
    }

    public void registrarCompra(Compra unaCompra) {
        this.listaCompras.add(unaCompra);
    }

    public int[] darReportePorMes(int unMes, int unAño) {

        boolean hayGasto = false;
        boolean vacia1 = true;
        boolean vacia2 = true;
        int gastoFijo = 0;
        int gastoEnCompras = 0;
        int[] gastos = new int[3];
        if (!this.getListaGastosFijos().isEmpty()) {
            gastoFijo = this.valorGastosFijos(unMes, unAño);
        }
        if (!this.getListaCompras().isEmpty()) {
            gastoEnCompras = this.valorCompras(unMes, unAño);
        }
        if (gastoFijo > 0 || gastoEnCompras > 0) {
            hayGasto = true;
        }
        if (hayGasto) {
            gastos[0] = 1;
            gastos[1] = gastoFijo;
            gastos[2] = gastoEnCompras;
        } else {
            gastos[0] = 0;
            gastos[1] = gastoFijo;
            gastos[2] = gastoEnCompras;
        }
        return gastos;
    }

    public int valorGastosFijos(int unMes, int unAño) {
        int gastoFijo = 0;
        for (int i = 0; i < this.getListaGastosFijos().size(); i++) {
            GastoFijo aux = this.getListaGastosFijos().get(i);
            if (aux.getMes() == unMes && aux.getAño() == unAño) {
                gastoFijo += aux.getCosto();
            }
        }
        return gastoFijo;
    }

    public int valorCompras(int unMes, int unAño) {
        int gastoEnCompras = 0;
        for (int j = 0; j < this.getListaCompras().size(); j++) {
            Compra auxCompra = this.getListaCompras().get(j);
            if (auxCompra.getMes() == unMes && auxCompra.getAño() == unAño) {
                gastoEnCompras += auxCompra.getCostoTotal();
            }
        }
        return gastoEnCompras;
    }

    public ArrayList<Stock> validarCantidadLista() {
        ArrayList<Stock> lista = new ArrayList<Stock>();
        for (int i = 0; i < this.getListaStocks().size(); i++) {
            Stock aux = this.getListaStocks().get(i);
            int suma = aux.getEnStock() - aux.getProducto().getStockMinimo();
            if (suma <= 2) {
                lista.add(aux);
            }
        }
        return lista;
    }

    public boolean actualizarListaStock(Stock unStock) {
        boolean actualizada = false;
        int pos = this.getListaProductos().indexOf(unStock.getProducto());
        int pos2 = this.getListaStocks().indexOf(unStock);
        if (pos != -1) {
            Producto existenteP = this.getListaProductos().get(pos);
            existenteP.setStockMinimo(unStock.getProducto().getStockMinimo());
        } else {
            this.getListaProductos().add(unStock.getProducto());
        }
        if (pos2 != -1) {
            Stock existente = this.getListaStocks().get(pos2);
            existente.getProducto().setStockMinimo(unStock.getProducto().getStockMinimo());
            existente.setEnStock(unStock.getEnStock());
            actualizada = true;
        } else {
            this.getListaStocks().add(unStock);
        }
        return actualizada;
    }

    public String actualizarListaInicio() {
        ArrayList<Stock> lista = this.validarCantidadLista();
        String linea = "Precaución con stock de: ";
        if (!lista.isEmpty()) {
            for (int j = 0; j < lista.size(); j++) {
                Stock aux = lista.get(j);
                linea = linea + aux.getProducto().getNombre() + ", ";
            }
        }
        return linea;
    }

    public boolean validarTotalNumeros(String palabra) {
        return palabra.length() > 8 || palabra.isEmpty() || palabra.equals("0");
    }

    public boolean validarTotalLetras(String palabra) {
        return palabra.length() > 15 || palabra.isEmpty();
    }

    public boolean okGastoFijo(String nombre, String costo, Calendar fecha) {
        boolean ok = true;

        if (validarTotalLetras(nombre)) {
            ok = false;
        }
        if (validarTotalNumeros(costo)) {
            ok = false;
        }
        if (fecha == null) {
            ok = false;
        }
        if (ok) {
            GastoFijo gasto = new GastoFijo();
            gasto.setNombre(nombre);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int año = fecha.get(Calendar.YEAR);
            int cos = Integer.parseInt(costo);
            gasto.setCosto(cos);
            gasto.setAño(año);
            gasto.setMes(mes);
            registrarGastoFijo(gasto);
        }
        return ok;
    }

    public boolean okComprar(String cantidad, String precioU, Producto p, Calendar d, int indice) {
        boolean ok = true;
        if (validarTotalNumeros(cantidad)) {
            ok = false;
        }
        if (validarTotalNumeros(precioU)) {
            ok = false;
        }
        if (p == null) {
            ok = false;
        }
        if (ok) {
            int precioUnidad = Integer.parseInt(precioU);
            int cant = Integer.parseInt(cantidad);
            int precioTotal = cant * precioUnidad;
            int mes = d.get(Calendar.MONTH) + 1;
            int año = d.get(Calendar.YEAR);
            for (int i = 0; i < this.getListaStocks().size(); i++) {
                Producto prod = this.getListaStocks().get(i).getProducto();
                if (p.equals(prod)) {
                    int enStock = this.getListaStocks().get(i).getEnStock() + cant;
                    Stock s = this.getListaStocks().get(indice);
                    s.setEnStock(enStock);
                }
            }
            Compra com = new Compra(p, precioTotal, precioUnidad, cant, mes, año);
            registrarCompra(com);
        }
        return ok;

    }

    public String calculoTotal(String precioU, String cantidad) {
        String resultado = "-1";
        if (!(precioU.isEmpty() || cantidad.isEmpty())
                && !(cantidad.equals("0"))
                && !(precioU.equals("0"))) {

            int precioUnidad = Integer.parseInt(precioU);
            int cant = Integer.parseInt(cantidad);
            String precioTotal = String.valueOf(cant * precioUnidad);
            resultado = precioTotal;
        }
        return resultado;
    }

}
