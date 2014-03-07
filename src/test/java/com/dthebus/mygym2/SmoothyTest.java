/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.Smoothy;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class SmoothyTest {
    
    public SmoothyTest() {
    }

    private static Smoothy sample;
    private static Smoothy sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Smoothy.Builder(3007).name("strawberry").build();
        Assert.assertEquals(sample.getID(),3007);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Smoothy.Builder(3007).name("berry").build();
        Assert.assertEquals(sample2.getName(),"berry");
      
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
