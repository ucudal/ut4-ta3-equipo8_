/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juan-
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
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

    /**
     * Test of insertar method, of class TArbolBB.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        TElementoAB expResult = null;
        TElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TArbolBB.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolBB instance = new TArbolBB();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TArbolBB.
     */
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciar method, of class TArbolBB.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        TArbolBB instance = new TArbolBB();
        boolean expResult = false;
        boolean result = instance.vaciar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorden method, of class TArbolBB.
     */
    @Test
    public void testInorden() {
        System.out.println("inorden");
        TArbolBB instance = new TArbolBB();
        Lista expResult = null;
        Lista result = instance.inorden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAltura method, of class TArbolBB.
     */
    @Test
    public void testObtenerAltura1Vacio() {
        System.out.println("obtenerAltura");
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura0() {
        System.out.println("obtenerAltura0");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura1() {
        System.out.println("obtenerAltura1");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura2_A() {
        System.out.println("obtenerAltura2_A");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(3, null));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura2_B() {
        System.out.println("obtenerAltura2_B");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(3, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(1, null));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerAltura2_C() {
        System.out.println("obtenerAltura2_C");
        TArbolBB instance = new TArbolBB();
        instance.insertar(new TElementoAB(3, null));
        instance.insertar(new TElementoAB(2, null));
        instance.insertar(new TElementoAB(1, null));
        instance.insertar(new TElementoAB(4, null));
        instance.insertar(new TElementoAB(5, null));
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of obtenerTamanio method, of class TArbolBB.
     */
    @Test
    public void testObtenerTamanio() {
        System.out.println("obtenerTamanio");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNivel method, of class TArbolBB.
     */
    @Test
    public void testObtenerNivel() {
        System.out.println("obtenerNivel");
        Comparable unaEtiqueta = null;
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerNivel(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCantidadHojas method, of class TArbolBB.
     */
    @Test
    public void testObtenerCantidadHojas() {
        System.out.println("obtenerCantidadHojas");
        TArbolBB instance = new TArbolBB();
        int expResult = 0;
        int result = instance.obtenerCantidadHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
