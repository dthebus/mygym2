/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.Sales;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class SalesTest {
    
    public SalesTest() {
    }

   private static Sales sample;
    private static Sales sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Sales.Builder(3009).name("usn").build();
        Assert.assertEquals(sample.getID(),3009);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Sales.Builder(3009).name("latte").build();
        Assert.assertEquals(sample2.getName(),"latte");
      
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
