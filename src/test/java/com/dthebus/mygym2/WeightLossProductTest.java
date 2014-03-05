/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.WeightLossProduct;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class WeightLossProductTest {
    
    public WeightLossProductTest() {
    }

   private static WeightLossProduct sample;
    private static WeightLossProduct sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new WeightLossProduct.Builder(3006).name("fatcut").build();
        Assert.assertEquals(sample.getID(),3006);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new WeightLossProduct.Builder(30026.name("phedracut").build();
        Assert.assertEquals(sample2.getName(),"phedracut");
      
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
