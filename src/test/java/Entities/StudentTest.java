package Entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class StudentTest {
    
    private Student s;
    private Date d;
            
    public StudentTest() {
        d = new Date();
        s = new Student("james", 10, d);
    }
   
     @Test
     public void hello() {
         String username = s.getUsrname();
         assertEquals("james10 should be ture", username, "james10");
     }
}




//  @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
