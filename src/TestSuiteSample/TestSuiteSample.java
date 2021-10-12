package TestSuiteSample;

import AssertSamples.AssertSamples;
import TestCaseSamples.TestCaseSamples;
import TestResultSamples.TestResultSamples;
import junit.framework.*;

public class TestSuiteSample {
    public static void main(String[] a) {
        // add the test's in the suite
        TestSuite suite = new TestSuite(AssertSamples.class,
                TestCaseSamples.class, TestResultSamples.class );
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("TEST SUITE :: Number of test cases = " + result.runCount());
    }
}
