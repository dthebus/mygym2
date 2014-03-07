/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.ExerciseClasses.Weightlifting;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class WeightLiftingTest {
    
    public WeightLiftingTest() {
    }

    private static Weightlifting sample;
    private static Weightlifting sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Weightlifting.Builder(2006).name("Benchpress").build();
        Assert.assertEquals(sample.getID(),2006);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Weightlifting.Builder(2006).name("Curls").build();
        Assert.assertEquals(sample2.getName(),"Curls");
      
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
