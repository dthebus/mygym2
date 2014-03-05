/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.Salad;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class SaladTest {
    
    public SaladTest() {
    }

    private static Salad sample;
    private static Salad sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Salad.Builder(4002).name("green").build();
        Assert.assertEquals(sample.getID(),4002);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Salad.Builder(4002).name("avo").build();
        Assert.assertEquals(sample2.getName(),"avo");
      
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
