/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.Wraps;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class WrapsTest {
    
    public WrapsTest() {
    }
private static Wraps sample;
    private static Wraps sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Wraps.Builder(3004).name("Avo").build();
        Assert.assertEquals(sample.getID(),3004);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Wraps.Builder(3004).name("Carrot").build();
        Assert.assertEquals(sample2.getName(),"Carrot");
      
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
