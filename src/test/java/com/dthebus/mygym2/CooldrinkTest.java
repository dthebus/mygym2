/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.Cooldrink;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class CooldrinkTest {
    
    public CooldrinkTest() {
    }
 private static Cooldrink sample;
    private static Cooldrink sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Cooldrink.Builder(3001).name("Energade").build();
        Assert.assertEquals(sample.getID(),3001);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Cooldrink.Builder(3001).name("Play").build();
        Assert.assertEquals(sample2.getName(),"Play");
      
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
