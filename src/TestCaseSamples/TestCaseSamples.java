package TestCaseSamples;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case defines the fixture to run multiple tests.
 * Some of the important methods of TestCase class are as follows
 */

public class TestCaseSamples extends TestCase {
    protected double fValue1;
    protected double fValue2;

    @Before
    // Sets up the fixture, for example, open a network connection.
    public void setUp(){
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd() {
        // counts the number of test cases
        System.out.println("Number of Test Case = " + this.countTestCases());

        // Gets the name of a TestCase.
        System.out.println(this.getName());

        // Sets the name of a TestCase.
        this.setName("NewTestName");
        System.out.println(this.getName());

    }

    public void tearDown(){
        // Tears down the fixture, for example, close a network connection.
    }
}
