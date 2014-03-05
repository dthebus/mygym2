/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.staff.ClassInstructors;
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
public class ClassInstructorTest {
    private static ClassInstructors sample;
    private static ClassInstructors sample2;
    public ClassInstructorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreation() throws Exception {
       sample = new ClassInstructors.Builder(1003).name("Tim").build();
        Assert.assertEquals(sample.getID(),1003);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new ClassInstructors.Builder(1003).name("Jane").build();
        Assert.assertEquals(sample2.getName(),"Jane");
      
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
