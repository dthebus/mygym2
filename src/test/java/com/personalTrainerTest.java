/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import com.dthebus.mygym2.model.staff.Employees;
import com.dthebus.mygym2.model.staff.personalTrainer;
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
public class personalTrainerTest {
    private static personalTrainer sample;
    private static personalTrainer sample2;
    public personalTrainerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCreation() throws Exception {
       sample = new personalTrainer.Builder(1001).name("John").build();
        Assert.assertEquals(sample.getID(),1001);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new personalTrainer.Builder(1001).name("Dave").build();
        Assert.assertEquals(sample2.getName(),"Dave");
      
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
