/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nayeem
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of addNumber method, of class Calculator.
     */
    @Test
    public void testAddNumber() {
            
        Calculator obj = new Calculator();
        
        int a = -1;
        int b = -0;
        
        int result = obj.addNumber(a,b);
        int exresult = -1;
        assertEquals(exresult,result);
    }

    @Test
    public void testSubNumber() {
        
        Calculator obj = new Calculator();
        
        int a = 2;
        int b = 4;
        int result = obj.subNumber(a,b);
        int exresult = -2;
        
        assertEquals(exresult,result);

    }

    @Test
    public void testMultiNumber() {
        
        Calculator obj = new Calculator();
        
        int a = 3;
        int b = 5;
        
        int result = obj.multiNumber(a,b);
        int exresult = 15;
        
        assertEquals(exresult,result);
                
    }

    @Test
    public void testDivNumber() {
        
        Calculator obj = new Calculator();
        
        double a = 5;
        double b = 3;
        
        double result = obj.divNumber(a, b);
        double exresult = 1.667;
        double delta = 0.1;
        
        assertEquals(exresult,result,delta);

    }
    
}
