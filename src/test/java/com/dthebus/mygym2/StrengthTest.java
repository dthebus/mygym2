/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.ExerciseClasses.Strength;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class StrengthTest {
    
    public StrengthTest() {
    }

   private static Strength sample;
    private static Strength sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Strength.Builder(2004).name("DeadLift").build();
        Assert.assertEquals(sample.getID(),2004);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Strength.Builder(2004).name("Circuit").build();
        Assert.assertEquals(sample2.getName(),"Circuit");
      
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
