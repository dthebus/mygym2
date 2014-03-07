/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.gymMembers.LimitedAccessMember;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class LimitedAccessMembersTest {
    private static LimitedAccessMember sample;
    private static LimitedAccessMember sample2;
    public LimitedAccessMembersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreation() throws Exception {
       sample = new LimitedAccessMember.Builder(1010).name("Tim").build();
        Assert.assertEquals(sample.getID(),1010);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new LimitedAccessMember.Builder(1010).name("Jane").build();
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
