/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int num1 = 2;
        int num2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 7;
        int result = instance.Suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int num1 = 2;
        int num2 = 2;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.Resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicación method, of class Operaciones.
     */
    @Test
    public void testMultiplicación() {
        System.out.println("Multiplicaci\u00f3n");
        int num1 = 2;
        int num2 = 2;
        Operaciones instance = new Operaciones();
        int expResult = 4;
        int result = instance.Multiplicación(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of División method, of class Operaciones.
     */
    @Test
    public void testDivisión() {
        System.out.println("Divisi\u00f3n");
        int num1 = 2;
        int num2 = 2;
        Operaciones instance = new Operaciones();
        int expResult = 1;
        int result = instance.División(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
