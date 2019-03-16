package E2EPractise;

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
        System.out.println("Here in branch");
        System.out.println("Develop update old project");
        System.out.println("Develop update new project");
        System.out.println("Here in master");
        System.out.println("Here in master");
        System.out.println("Here in master");
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
    	System.out.println("Develop only old proj");
        assertTrue( true );
        System.out.println("Here in branch");
        System.out.println("Here in branch");
    }
}
