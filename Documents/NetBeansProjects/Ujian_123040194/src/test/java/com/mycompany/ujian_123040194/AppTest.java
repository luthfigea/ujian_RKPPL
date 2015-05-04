package com.mycompany.ujian_123040194;

import static junit.framework.Assert.assertTrue;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    
  protected int value1, value2;
   
   // assigning the values
   protected void setUp(){
      value1=3;
      value2=3;
   }
    // test method to add two values
   public void testAdd(){
      double result= value1 + value2;
      assertTrue(result == 6);
   }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   private static Soal S;
   
   @Before
   public void awalTest(){
      S = new Soal();
     System.out.println("awal testing");
   }
   
    /**
     *
     * @param testName
     */
    @After
    public void akhirTest(){    
     System.out.println("akhir testing");
   }
   
    public AppTest( String testName )
    {
        
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
   
}
