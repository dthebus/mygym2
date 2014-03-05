/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.Products.HotBeverages;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class HotBeveragesTest {
    
    public HotBeveragesTest() {
    }

    private static HotBeverages sample;
    private static HotBeverages sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new HotBeverages.Builder(3002).name("Coffee").build();
        Assert.assertEquals(sample.getID(),3002);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new HotBeverages.Builder(3002).name("latte").build();
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
