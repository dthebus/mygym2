/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.ExerciseClasses.TargetAreaClass;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class TargetAreaTest {
    
    public TargetAreaTest() {
    }
 private static TargetAreaClass sample;
    private static TargetAreaClass sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new TargetAreaClass.Builder(2005).name("Chest").build();
        Assert.assertEquals(sample.getID(),2005);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new TargetAreaClass.Builder(2005).name("Abs").build();
        Assert.assertEquals(sample2.getName(),"Abs");
      
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
