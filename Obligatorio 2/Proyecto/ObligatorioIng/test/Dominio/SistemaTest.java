package Dominio;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Verde
 */
public class SistemaTest {

    public SistemaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRegistrarGastoFijo() {
        System.out.println("registrarGastoFijo");
        GastoFijo unGasto = new GastoFijo("Antel", 2000, 06, 2016);
        Sistema instance = new Sistema();
        int expResult = 1;
        instance.registrarGastoFijo(unGasto);
        int result = instance.getListaGastosFijos().size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testRegistrarCompra() {
        System.out.println("registrarCompra");
        Compra cUno = new Compra(new Producto("pepe", 3), 1000, 2, 2, 9, 2016);
        //Compra cDos = new Compra(new Producto("Roberto", 5), 2100, 3, 700, 5, 2016);
        Sistema instance = new Sistema();
        int expResult = 1;
        instance.registrarCompra(cUno);
        int result = instance.getListaCompras().size();
        assertEquals(expResult, result);

    }

    @Test
    public void testOkGastoFijo() {
        System.out.println("okGuardado");
        //GastoFijo g =  new GastoFijo(" ", 10, 5, 1999);
        Sistema instance = new Sistema();
        boolean expResult = true;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("Alfredo", "10", c);
        assertEquals(expResult, result);
    }

    //Test sin nombre
    @Test
    public void testOkGastoFijo01() {
        System.out.println("okGuardado01");
        Sistema instance = new Sistema();
        boolean expResult = false;
        Calendar c = Calendar.getInstance();
        String vacio = "";
        boolean result = instance.okGastoFijo("", "10", c);
        assertEquals(expResult, result);
    }

    //Test sin costo
    @Test
    public void testOkGastoFijo02() {
        System.out.println("okGuardado02");
        Sistema instance = new Sistema();
        boolean expResult = false;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("Fernando", "", c);
        assertEquals(expResult, result);
    }

    //Test sin nombre ni costo
    @Test
    public void testOkGastoFijo03() {
        System.out.println("okGuardado03");
        Sistema instance = new Sistema();
        boolean expResult = false;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("", "", c);
        assertEquals(expResult, result);
    }

    //Test con costo cero
    @Test
    public void testOkGastoFijo04() {
        System.out.println("okGuardado04");
        Sistema instance = new Sistema();
        boolean expResult = false;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("Agustin", "0", c);
        assertEquals(expResult, result);
    }

    //Test con costo 1
    @Test
    public void testOkGastoFijo05() {
        System.out.println("okGuardado05");
        Sistema instance = new Sistema();
        boolean expResult = true;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("Agustin", "1", c);
        assertEquals(expResult, result);
    }

    // Con costo máximo permitido 8 digitos
    @Test
    public void testOkGastoFijo06() {
        System.out.println("okGuardado06");
        Sistema instance = new Sistema();
        boolean expResult = true;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("Agustin", "12345678", c);
        assertEquals(expResult, result);
    }

    // Con costo mayor a 8 digitos
    @Test
    public void testOkGastoFijo07() {
        System.out.println("okGuardado07");
        Sistema instance = new Sistema();
        boolean expResult = false;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("Agustin", "123456789", c);
        assertEquals(expResult, result);
    }

    // Con un caracter en nombre
    @Test
    public void testOkGastoFijo08() {
        System.out.println("okGuardado08");
        Sistema instance = new Sistema();
        boolean expResult = true;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("A", "1234", c);
        assertEquals(expResult, result);
    }

    // Con 15 caracteres en nombre
    @Test
    public void testOkGastoFijo09() {
        System.out.println("okGuardado09");
        Sistema instance = new Sistema();
        boolean expResult = true;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("123456789123456", "1234", c);
        assertEquals(expResult, result);
    }

    // Con más de 15 caracteres en nombre
    @Test
    public void testOkGastoFijo10() {
        System.out.println("okGuardado10");
        Sistema instance = new Sistema();
        boolean expResult = false;
        Calendar c = Calendar.getInstance();
        boolean result = instance.okGastoFijo("1234567891234567", "1234", c);
        assertEquals(expResult, result);
    }

    //Con numero 0
    @Test
    public void testValidarTotalNumeros01() {
        System.out.println("validarTotalNumeros01");
        Sistema instance = new Sistema();
        boolean expResult = true;
        boolean result = instance.validarTotalNumeros("0");
        assertEquals(expResult, result);
    }

    //Con 8 caracteres
    @Test
    public void testValidarTotalNumeros02() {
        System.out.println("validarTotalNumeros02");
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validarTotalNumeros("12345678");
        assertEquals(expResult, result);
    }

    //Con numero 1
    @Test
    public void testValidarTotalNumeros03() {
        System.out.println("validarTotalNumeros03");
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validarTotalNumeros("1");
        assertEquals(expResult, result);
    }

    //Con mas de 8 caracteres
    @Test
    public void testValidarTotalNumeros04() {
        System.out.println("validarTotalNumeros04");
        Sistema instance = new Sistema();
        boolean expResult = true;
        boolean result = instance.validarTotalNumeros("123456789");
        assertEquals(expResult, result);
    }

    //Con mas de 5 caracteres
    @Test
    public void testValidarTotalNumeros05() {
        System.out.println("validarTotalNumeros05");
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validarTotalNumeros("12345");
        assertEquals(expResult, result);
    }

    //Sin letras
    @Test
    public void testValidarTotalPalabras01() {
        System.out.println("validarTotalPalabras01");
        Sistema instance = new Sistema();
        boolean expResult = true;
        boolean result = instance.validarTotalLetras("");
        assertEquals(expResult, result);
    }

    //Con una letra 
    @Test
    public void testValidarTotalPalabras02() {
        System.out.println("validarTotalPalabras02");
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validarTotalLetras("a");
        assertEquals(expResult, result);
    }

    //Con 15 letras
    @Test
    public void testValidarTotalPalabras03() {
        System.out.println("validarTotalPalabras03");
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validarTotalLetras("123456789123456");
        assertEquals(expResult, result);
    }

    //Con 16 letras
    @Test
    public void testValidarTotalPalabras04() {
        System.out.println("validarTotalPalabras04");
        Sistema instance = new Sistema();
        boolean expResult = true;
        boolean result = instance.validarTotalLetras("1234567891234567");
        assertEquals(expResult, result);
    }

    //sin caracteres en cantidades
    @Test
    public void testOkComprar01() {
        System.out.println("OkComprar01");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = false;
        boolean result = instance.okComprar("", "10", p, c, 0);
        assertEquals(expResult, result);
    }

    //Con un caracter  en cantidades
    @Test
    public void testOkComprar02() {
        System.out.println("OkComprar02");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = true;
        boolean result = instance.okComprar("1", "10", p, c, 0);
        assertEquals(expResult, result);
    }

    //Con  5 caracteres en cantidades
    @Test
    public void testOkComprar03() {
        System.out.println("OkComprar03");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = true;
        boolean result = instance.okComprar("54321", "10", p, c, 0);
        assertEquals(expResult, result);
    }

    //Con numero 8 en cantidades
    @Test
    public void testOkComprar04() {
        System.out.println("OkComprar04");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = true;
        boolean result = instance.okComprar("12345678", "10", p, c, 0);
        assertEquals(expResult, result);
    }

    //con numero 9
    @Test
    public void testOkComprar05() {
        System.out.println("OkComprar05");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = false;
        boolean result = instance.okComprar("123456789", "10", p, c, 0);
        assertEquals(expResult, result);
    }

    //sin caracteres en precio unitario
    @Test
    public void testOkComprar06() {
        System.out.println("OkComprar06");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = false;
        boolean result = instance.okComprar("10", "", p, c, 0);
        assertEquals(expResult, result);
    }

    //con un caracteres en precio unitario
    @Test
    public void testOkComprar07() {
        System.out.println("OkComprar07");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = true;
        boolean result = instance.okComprar("10", "7", p, c, 0);
        assertEquals(expResult, result);
    }

    //con cinco caracteres en precio unitario
    @Test
    public void testOkComprar08() {
        System.out.println("OkComprar08");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = true;
        boolean result = instance.okComprar("10", "12345", p, c, 0);
        assertEquals(expResult, result);
    }

    //con 8 caracteres en precio unitario
    @Test
    public void testOkComprar09() {
        System.out.println("OkComprar09");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = true;
        boolean result = instance.okComprar("10", "12345678", p, c, 0);
        assertEquals(expResult, result);
    }

    //con 9 caracteres en precio unitario
    @Test
    public void testOkComprar10() {
        System.out.println("OkComprar10");
        Sistema instance = new Sistema();
        Producto p = new Producto();
        Calendar c = Calendar.getInstance();
        boolean expResult = false;
        boolean result = instance.okComprar("10", "123456789", p, c, 0);
        assertEquals(expResult, result);
    }

    //Mathias para abajo
    /**
     * Test de quitarProducto01, esperamos que haya uno menos en lista de stock.
     */
    @Test
    public void testQuitarProducto01() {
        System.out.println("quitarProducto01");
        Stock unStock01 = new Stock(new Producto("Blem", 3), 8);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 16);
        Stock seleccionado = new Stock(new Producto("Harina", 3), 5);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(unStock01);
        instance.getListaStocks().add(unStock2);
        int expResult = unStock01.getEnStock() - 1;
        boolean test = instance.quitarProducto(unStock01);
        for (int i = 0; i < instance.getListaStocks().size(); i++) {
            Stock aux = instance.getListaStocks().get(i);
            if (aux.getProducto().equals(unStock01.getProducto())) {
                seleccionado = aux;
            }
        }
        int resultado = seleccionado.getEnStock();
        assertEquals(expResult, resultado);
        System.out.println("esperado " + expResult + "resultado " + resultado);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test de quitarProducto, caso borde que cauando se saque un producto se
     * elimine el stock.
     */
    @Test
    public void testQuitarProducto02() {
        System.out.println("quitarProducto02");
        Stock unStock01 = new Stock(new Producto("Blem", 3), 1);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 16);
        Stock seleccionado = new Stock(new Producto("Harina", 0), 0);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(unStock01);
        instance.getListaStocks().add(unStock2);
        Stock expResult = null;
        boolean test = instance.quitarProducto(unStock01);
        for (int i = 0; i < instance.getListaStocks().size(); i++) {
            Stock aux = instance.getListaStocks().get(i);
            if (aux.getProducto().equals(unStock01.getProducto())) {
                seleccionado = aux;
            } else {
                seleccionado = null;
            }
        }
        Stock resultado = seleccionado;
        assertNull(resultado);
        System.out.println("esperado " + expResult + "resultado " + resultado);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     *
     * Test de quitarProducto, caso borde con IntegerMAX_VALUE +1 .
     */

    @Test
    public void testQuitarProducto03() {
        System.out.println("quitarProducto03");
        int max = Integer.MAX_VALUE + 1;
        Stock unStock01 = new Stock(new Producto("Blem", 3), max);
        Stock unStock02 = new Stock(new Producto("Azucar", 6), 16);
        Stock seleccionado = new Stock(new Producto("Harina", 3), 5);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(unStock01);
        instance.getListaStocks().add(unStock02);
        int expResult = Integer.MAX_VALUE;
        boolean test = instance.quitarProducto(unStock01);
        for (int i = 0; i < instance.getListaStocks().size(); i++) {
            Stock aux = instance.getListaStocks().get(i);
            if (aux.getProducto().equals(unStock01.getProducto())) {
                seleccionado = aux;
            }
        }
        int resultado = seleccionado.getEnStock();
        assertEquals(expResult, resultado);
        System.out.println("esperado " + expResult + " resultado " + resultado);
    }

    /**
     * Test de darReportePorMes, caso en el que no tiene nada, todo los array
     * devuelven 0.
     */
    @Test
    public void testDarReportePorMes01() {
        System.out.println("darReportePorMes01");
        int unMes = 03;
        int unAño = 2016;
        Sistema instance = new Sistema();
        int[] expResult = new int[3];
        expResult[0] = 0;
        expResult[1] = 0;
        expResult[2] = 0;
        int[] result = instance.darReportePorMes(unMes, unAño);
        assertArrayEquals(expResult, result);
        for (int i = 0; i < expResult.length; i++) {
            System.out.println("resultado " + expResult[i] + " esperado " + expResult[i]);
        }
    }

    /**
     * Test de darReportePorMes, caso en el que solo tiene gastoFijo cargado.
     */
    @Test
    public void testDarReportePorMes02() {
        System.out.println("darReportePorMes02");
        int unMes = 06;
        int unAño = 2016;
        Sistema instance = new Sistema();
        GastoFijo gasto = new GastoFijo("Antel", 2000, 06, 2016);
        instance.getListaGastosFijos().add(gasto);
        int[] expResult = new int[3];
        expResult[0] = 1;
        expResult[1] = 2000;
        expResult[2] = 0;
        int[] result = instance.darReportePorMes(unMes, unAño);
        assertArrayEquals(expResult, result);
        for (int i = 0; i < expResult.length; i++) {
            System.out.println("resultado " + expResult[i] + " esperado " + expResult[i]);
        }
    }

    /**
     * Test de darReportePorMes, caso en el que solo tiene una compra cargada.
     */
    @Test
    public void testDarReportePorMes03() {
        System.out.println("darReportePorMes03");
        int unMes = 06;
        int unAño = 2016;
        Sistema instance = new Sistema();
        Compra compra = new Compra(new Producto("pepe", 3), 3000, 1000, 3, 06, 2016);
        instance.getListaCompras().add(compra);
        int[] expResult = new int[3];
        expResult[0] = 1;
        expResult[1] = 0;
        expResult[2] = 3000;
        int[] result = instance.darReportePorMes(unMes, unAño);
        assertArrayEquals(expResult, result);
        for (int i = 0; i < expResult.length; i++) {
            System.out.println("resultado " + expResult[i] + " esperado " + expResult[i]);
        }
    }

    /**
     * Test de darReportePorMes, caso en el que tiene una Compra y un GastoFijo
     * cargados.
     */
    @Test
    public void testDarReportePorMes04() {
        System.out.println("darReportePorMes04");
        int unMes = 06;
        int unAño = 2016;
        Sistema instance = new Sistema();
        Compra compra = new Compra(new Producto("pepe", 3), 3000, 1000, 3, 06, 2016);
        GastoFijo gasto = new GastoFijo("Antel", 2000, 06, 2016);
        instance.getListaCompras().add(compra);
        instance.getListaGastosFijos().add(gasto);
        int[] expResult = new int[3];
        expResult[0] = 1;
        expResult[1] = 2000;
        expResult[2] = 3000;
        int[] result = instance.darReportePorMes(unMes, unAño);
        assertArrayEquals(expResult, result);
        for (int i = 0; i < expResult.length; i++) {
            System.out.println("resultado " + expResult[i] + " esperado " + expResult[i]);
        }
    }

    /**
     * Test de darReportePorMes, caso en el que el mes dado no tiene gastos
     * cargados.
     */
    @Test
    public void testDarReportePorMes05() {
        System.out.println("darReportePorMes05");
        int unMes = 03;
        int unAño = 2016;
        Sistema instance = new Sistema();
        GastoFijo gasto = new GastoFijo("Antel", 2000, 06, 2016);
        instance.getListaGastosFijos().add(gasto);
        int[] expResult = new int[3];
        expResult[0] = 0;
        expResult[1] = 0;
        expResult[2] = 0;
        int[] result = instance.darReportePorMes(unMes, unAño);
        System.out.println("");
        assertArrayEquals(expResult, result);
        for (int i = 0; i < expResult.length; i++) {
            System.out.println("resultado " + expResult[i] + " esperado " + expResult[i]);
        }
    }

    /**
     * Test de validarCantidadListas, caso en el que la diferencia enre enStock
     * y stockMinimo sea mayor a 2.
     */
    @Test
    public void testValidarCantidadLista01() {
        System.out.println("validarCantidadLista01");
        Sistema instance = new Sistema();
        Stock unStock1 = new Stock(new Producto("Blem", 3), 6);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 16);
        Stock unStock3 = new Stock(new Producto("Harina", 5), 10);
        instance.getListaStocks().add(unStock1);
        instance.getListaStocks().add(unStock2);
        instance.getListaStocks().add(unStock3);
        int valorExpResult = 0;
        ArrayList<Stock> result = instance.validarCantidadLista();
        int valorResult = result.size();
        assertEquals(valorExpResult, valorResult);
        System.out.println("lista esperada " + valorExpResult + " lista final " + valorResult);
    }

    /**
     * Test de validarCantidadListas, caso en el que hay solo un producto que la
     * diferencia de stockMinimo y enStock = 2.
     */
    @Test
    public void testValidarCantidadLista02() {
        System.out.println("validarCantidadLista02");
        Sistema instance = new Sistema();
        Stock unStock1 = new Stock(new Producto("Blem", 3), 5);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 9);
        Stock unStock3 = new Stock(new Producto("Harina", 5), 10);
        instance.getListaStocks().add(unStock1);
        instance.getListaStocks().add(unStock2);
        instance.getListaStocks().add(unStock3);
        int valorExpResult = 1;
        ArrayList<Stock> result = instance.validarCantidadLista();
        int valorResult = result.size();
        assertEquals(valorExpResult, valorResult);
        System.out.println("lista esperada " + valorExpResult + " lista final " + valorResult);
    }

    /**
     * Test de validarCantidadListas, caso en el que todos los productos que hay
     * en la lista, la diferencia de stockMinimo y enStock es = 2, menor que 2 o
     * menor que stockMinimo.
     */
    @Test
    public void testValidarCantidadLista03() {
        System.out.println("validarCantidadLista03");
        Sistema instance = new Sistema();
        Stock unStock1 = new Stock(new Producto("Blem", 3), 5);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 7);
        Stock unStock3 = new Stock(new Producto("Harina", 5), 3);
        instance.getListaStocks().add(unStock1);
        instance.getListaStocks().add(unStock2);
        instance.getListaStocks().add(unStock3);
        int valorExpResult = 3;
        ArrayList<Stock> result = instance.validarCantidadLista();
        int valorResult = result.size();
        assertEquals(valorExpResult, valorResult);
        System.out.println("lista esperada " + valorExpResult + " lista final " + valorResult);
    }

    /**
     * Test of actualizarListaStock, caso en que no existe ni el producto ni el
     * stock en el sistema.
     */
    @Test
    public void testActualizarListaStock01() {
        System.out.println("actualizarListaStock01");
        Stock unStock1 = new Stock(new Producto("Blem", 5), 8);
        Stock st = new Stock(new Producto("Azucar", 10), 16);
        Producto prod = new Producto("Cocoa", 2);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(st);
        instance.getListaProductos().add(prod);
        boolean expResult = false;
        boolean result = instance.actualizarListaStock(unStock1);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of actualizarListaStock method, caso en que existe el producto en el
     * sistema, pero no el Stock.
     */
    @Test
    public void testActualizarListaStock02() {
        System.out.println("actualizarListaStock02");
        Stock unStock1 = new Stock(new Producto("Cocoa", 2), 8);
        Stock st = new Stock(new Producto("Azucar", 10), 16);
        Producto prod = new Producto("Cocoa", 2);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(st);
        instance.getListaProductos().add(prod);
        boolean expResult = false;
        boolean result = instance.actualizarListaStock(unStock1);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of actualizarListaStock method, caso en que existe el Stock pero no
     * el producto en sistema. en el sistema, pero no el Stock.
     */
    @Test
    public void testActualizarListaStock03() {
        System.out.println("actualizarListaStock03");
        Stock unStock1 = new Stock(new Producto("Azucar", 10), 16);
        Producto p1 = new Producto("Blem", 5);
        Stock st = new Stock(new Producto("Azucar", 10), 16);
        Producto prod = new Producto("Cocoa", 2);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(st);
        instance.getListaProductos().add(p1);
        instance.getListaProductos().add(prod);
        boolean expResult = true;
        boolean result = instance.actualizarListaStock(unStock1);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of actualizarListaStock method, caso en que existe el Stock y el
     * producto en el sistema.
     */
    @Test
    public void testActualizarListaStock04() {
        System.out.println("actualizarListaStock04");
        Stock unStock1 = new Stock(new Producto("Blem", 5), 16);
        Producto p1 = new Producto("Blem", 5);
        Producto prod = new Producto("Cocoa", 2);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(unStock1);
        instance.getListaProductos().add(p1);
        instance.getListaProductos().add(prod);
        boolean expResult = true;
        boolean result = instance.actualizarListaStock(unStock1);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of actualizarListaInicio method, caso en el que el método interior
     * (validarCantidadLista) devuleva lista vacia. Espero que retorne la línea
     * sin ningun producto.
     */
    @Test
    public void testActualizarListaInicio01() {
        System.out.println("actualizarListaInicio01");
        String expResult = "Precacución con stock de: ";
        Stock unStock1 = new Stock(new Producto("Blem", 3), 6);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 16);
        Stock unStock3 = new Stock(new Producto("Harina", 5), 10);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(unStock1);
        instance.getListaStocks().add(unStock2);
        instance.getListaStocks().add(unStock3);
        String result = instance.actualizarListaInicio();
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);

    }

    /**
     * Test of actualizarListaInicio method, caso en el que el método interior
     * (validarCantidadLista) devuleva una lista con elementos en su interior.
     * Espero que retorne la línea más los productos que contenga la lista
     */
    @Test
    public void testActualizarListaInicio02() {
        System.out.println("actualizarListaInicio02");
        String expResult = "Precacución con stock de: Blem, Azucar, ";
        Stock unStock1 = new Stock(new Producto("Blem", 3), 5);
        Stock unStock2 = new Stock(new Producto("Azucar", 6), 7);
        Stock unStock3 = new Stock(new Producto("Harina", 5), 10);
        Sistema instance = new Sistema();
        instance.getListaStocks().add(unStock1);
        instance.getListaStocks().add(unStock2);
        instance.getListaStocks().add(unStock3);
        String result = instance.actualizarListaInicio();
        System.out.println(" ");
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of valorCompras method, se ingresará a éste método siempre que la
     * lista compras de sistema tenga compras cargadas. En este caso vemos que
     * hay compras en la lista pero sólo una de ellas cumple el mes escogido.
     */
    @Test
    public void valorCompras01() {
        System.out.println("valorCompras01");
        Compra cUno = new Compra(new Producto("Azucar", 3), 1000, 500, 2, 10, 2016);
        Compra cDos = new Compra(new Producto("Arroz", 4), 1000, 200, 5, 9, 2016);
        Sistema instance = new Sistema();
        instance.getListaCompras().add(cUno);
        instance.getListaCompras().add(cDos);
        int expResult = 1000;
        int result = instance.valorCompras(10, 2016);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of valorCompras method, se ingresará a éste método siempre que la
     * lista compras de sistema tenga compras cargadas. En este caso vemos que
     * hay compras en la lista donde ninguna cumple el mes.
     */
    @Test
    public void valorCompras02() {
        System.out.println("valorCompras02");
        Compra cUno = new Compra(new Producto("Azucar", 3), 1000, 500, 2, 05, 2016);
        Compra cDos = new Compra(new Producto("Arroz", 4), 1000, 200, 5, 9, 2016);
        Sistema instance = new Sistema();
        instance.getListaCompras().add(cUno);
        instance.getListaCompras().add(cDos);
        int expResult = 0;
        int result = instance.valorCompras(10, 2016);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of valorCompras method, se ingresará a éste método siempre que la
     * lista compras de sistema tenga compras cargadas. En este caso vemos que
     * hay compras en la lista donde todos cumplen mes pero uno en diferente
     * año.
     */
    @Test
    public void valorCompras03() {
        System.out.println("valorCompras03");
        Compra cUno = new Compra(new Producto("Azucar", 3), 1000, 500, 2, 11, 2016);
        Compra cDos = new Compra(new Producto("Arroz", 4), 1000, 200, 5, 11, 2008);
        Sistema instance = new Sistema();
        instance.getListaCompras().add(cUno);
        instance.getListaCompras().add(cDos);
        int expResult = 1000;
        int result = instance.valorCompras(11, 2016);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of valorCompras method, se ingresará a éste método siempre que la
     * lista compras de sistema tenga compras cargadas. En este caso vemos que
     * hay compras en la lista donde todos cumplen el mes y año.
     */
    @Test
    public void valorCompras04() {
        System.out.println("valorCompras04");
        Compra cUno = new Compra(new Producto("Azucar", 3), 1000, 500, 2, 11, 2018);
        Compra cDos = new Compra(new Producto("Arroz", 4), 1000, 200, 5, 11, 2018);
        Sistema instance = new Sistema();
        instance.getListaCompras().add(cUno);
        instance.getListaCompras().add(cDos);
        int expResult = 2000;
        int result = instance.valorCompras(11, 2018);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

    /**
     * Test of valorGastosFijos method, se ingresará a éste método siempre que la lista
     * gastos fijos de sistema tenga compras cargadas.
     * En este caso vemos que hay gastos fijos en la lista pero sólo uno cumple el mes escogido.
     */
    @Test
    public void valorGastosFijos01() {
        System.out.println("valorGastosFijos01");
        GastoFijo gfUno = new GastoFijo( "Antel", 2000, 06, 2016);
        GastoFijo gfDos = new GastoFijo( "Ute", 1500, 07, 2016);
        Sistema instance = new Sistema();
        instance.getListaGastosFijos().add(gfUno);
        instance.getListaGastosFijos().add(gfDos);
        int expResult = 2000;
        int result = instance.valorGastosFijos(06, 2016);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }

     /**
     * Test of valorGastosFijos method, se ingresará a éste método siempre que la
     * lista de gastos fijos de sistema tenga compras cargadas. En este caso vemos que
     * hay gastos fijos en la lista donde ninguno cumple el mes.
     */
    @Test
    public void valorGastosFijos02() {
        System.out.println("valorGastosFijos02");
        GastoFijo gfUno = new GastoFijo( "Antel", 2000, 12, 2016);
        GastoFijo gfDos = new GastoFijo( "Ute", 1500, 07, 2016);
        Sistema instance = new Sistema();
        instance.getListaGastosFijos().add(gfUno);
        instance.getListaGastosFijos().add(gfDos);
        int expResult = 0;
        int result = instance.valorGastosFijos(06, 2016);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }
    
    /**
     * Test of  valorGastosFijos method, se ingresará a éste método siempre que la
     * lista de gastos fijos de sistema tenga compras cargadas. En este caso vemos que
     * hay gastos fijos en la lista donde todos cumplen mes pero uno en diferente
     * año.
     */
    @Test
    public void valorGastosFijos03() {
        System.out.println("valorGastosFijos03");
        GastoFijo gfUno = new GastoFijo( "Antel", 2000, 07, 2017);
        GastoFijo gfDos = new GastoFijo( "Ute", 1500, 07, 2016);
        Sistema instance = new Sistema();
        instance.getListaGastosFijos().add(gfUno);
        instance.getListaGastosFijos().add(gfDos);
        int expResult = 1500;
        int result = instance.valorGastosFijos(07, 2016);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }
    
    /**
     * Test of valorGastosFijos method, se ingresará a éste método siempre que la
     * lista de gastos fijos de sistema tenga compras cargadas. En este caso vemos que
     * hay gastos fijos en la lista donde todos cumplen el mes y año.
     */
    @Test
    public void valorGastosFijos04() {
        System.out.println("valorGastosFijos04");
        GastoFijo gfUno = new GastoFijo( "Antel", 2000, 05, 2002);
        GastoFijo gfDos = new GastoFijo( "Ute", 1500, 05, 2002);
        Sistema instance = new Sistema();
        instance.getListaGastosFijos().add(gfUno);
        instance.getListaGastosFijos().add(gfDos);
        int expResult = 3500;
        int result = instance.valorGastosFijos(05, 2002);
        assertEquals(expResult, result);
        System.out.println("resultado " + expResult + " esperado " + result);
    }
}
