/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.staff.AdminStaff;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class AdminTest {
    
    public AdminTest() {
    }
    private static AdminStaff sample;
    private static AdminStaff sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new AdminStaff.Builder(1008).name("Tim").build();
        Assert.assertEquals(sample.getID(),1008);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new AdminStaff.Builder(1008).name("Jane").build();
        Assert.assertEquals(sample2.getName(),"Jane");
      
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
