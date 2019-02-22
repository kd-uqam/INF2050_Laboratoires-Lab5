package org.exemple.lab2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
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
    /**
     * Testing addition
     */
    
    public void testAdd()
    {
        App tester = new App(); // App is tested
        int a = 1452;
        int b = 567;
        
        int expectedValue = a+b;
        // assert statements
        //assertEquals(10, tester.add(10, 0), "10 + 0 must be 10");
 
        assertTrue("CECI NEST PAS UNE ADDITION", expectedValue == tester.add(a,b) );
    }
}
