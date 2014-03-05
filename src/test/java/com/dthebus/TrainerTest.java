/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus;

import com.dthebus.mygym2.model.staff.Trainer;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class TrainerTest {
     private static Trainer sample;
    private static Trainer sample2;
    public TrainerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
 @Test
    public void testCreation() throws Exception {
       sample = new Trainer.Builder(1002).name("Mary").build();
        Assert.assertEquals(sample.getID(),1002);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new Trainer.Builder(1002).name("Kate").build();
        Assert.assertEquals(sample2.getName(),"Kate");
      
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
