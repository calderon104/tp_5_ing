/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_5ingsoftware;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gonza
 */
public class calculadorTest {
      private static calculador calculador;
    public calculadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calculador = new calculador();
        System.out.println("Bienvenido a la calculadora");
    }
    
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("la operación ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
     /*@BeforeEach
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    */
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    /**
     * Test of sumar method, of class calculador.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        assertEquals(5.5, calculador.sumar(2.5, 3.0), 0.001);
    }

    /**
     * Test of restar method, of class calculador.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        assertEquals(1.5, calculador.restar(3.0, 1.5), 0.001);
    }

    /**
     * Test of multiplicar method, of class calculador.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 2;
        int b = 2;
        calculador instance = new calculador();
        int expResult = 4;
        int result = (int) instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of dividir method, of class calculador.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 25;
        int b = 5;
        calculador instance = new calculador();
        int expResult = 5;
        int result = (int) instance.dividir(a, b);
        assertEquals(expResult, result);

    }
    
}
