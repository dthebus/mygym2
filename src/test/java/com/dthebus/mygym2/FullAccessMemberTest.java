/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.gymMembers.AllAccessMember;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class FullAccessMemberTest {
    private static AllAccessMember sample;
    private static AllAccessMember sample2;
    public FullAccessMemberTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreation() throws Exception {
       sample = new AllAccessMember.Builder(1009).name("Tim").build();
        Assert.assertEquals(sample.getID(),1009);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new AllAccessMember.Builder(1009).name("Jane").build();
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
