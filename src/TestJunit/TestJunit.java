package TestJunit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// This test class checks JUnit works fine.
public class TestJunit {

    @Test
    public void TestAdd(){
        String str = "Welcome to JUnit!";
        assertEquals("Welcome to JUnit!", str);
    }
}
