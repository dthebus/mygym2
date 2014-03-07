/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.NutritionalProducts;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class NutritionalProductsTest {
    
    public NutritionalProductsTest() {
    }

    private static NutritionalProducts sample;
    private static NutritionalProducts sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new NutritionalProducts.Builder(4003).name("usn").build();
        Assert.assertEquals(sample.getID(),4003);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new NutritionalProducts.Builder(4003).name("max").build();
        Assert.assertEquals(sample2.getName(),"max");
      
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
