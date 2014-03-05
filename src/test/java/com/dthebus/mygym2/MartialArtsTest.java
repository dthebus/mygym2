/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.mygym2;

import com.dthebus.mygym2.model.ExerciseClasses.MartialArts;
import static org.testng.Assert.*;

/**
 *
 * @author student
 */
public class MartialArtsTest {
    
    public MartialArtsTest() {
    }

    private static MartialArts sample;
    private static MartialArts sample2;
    
@Test
    public void testCreation() throws Exception {
       sample = new MartialArts.Builder(2003).name("kick Boxing").build();
        Assert.assertEquals(sample.getID(),2003);
      
    }
    @Test
     public void testUpdate() throws Exception {
       sample2 = new MartialArts.Builder(2003).name("Tai Chi").build();
        Assert.assertEquals(sample2.getName(),"Tai Chi");
      
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
