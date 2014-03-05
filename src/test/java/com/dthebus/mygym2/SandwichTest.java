/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.Sandwich;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class SandwichTest {
    
    public SandwichTest() {
    }

    private static Sandwich sample;
    private static Sandwich sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Sandwich.Builder(3008).name("Cheese").build();
        Assert.assertEquals(sample.getID(),3008);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Sandwich.Builder(3008).name("veg").build();
        Assert.assertEquals(sample2.getName(),"veg");
      
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
