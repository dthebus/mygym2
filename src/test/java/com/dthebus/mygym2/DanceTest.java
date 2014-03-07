/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.ExerciseClasses.Dance;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class DanceTest {
    
    public DanceTest() {
    }

    private static Dance sample;
    private static Dance sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new Dance.Builder(2002).name("Zuma").build();
        Assert.assertEquals(sample.getID(),2002);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Dance.Builder(2002).name("Zumba").build();
        Assert.assertEquals(sample2.getName(),"Zumba");
      
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
