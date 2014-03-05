/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.ExerciseClasses.Cardio;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class CardioTest {
    
    public CardioTest() {
    }

     private static Cardio sample;
    private static Cardio sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Cardio.Builder(2001).name("Cycle").build();
        Assert.assertEquals(sample.getID(),2001);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Cardio.Builder(2001).name("Run").build();
        Assert.assertEquals(sample2.getName(),"Run");
      
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
