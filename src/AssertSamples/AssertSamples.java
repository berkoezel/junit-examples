package AssertSamples;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class provides a set of assertion methods useful for writing tests.
 * Only failed assertions are recorded.
 */

public class AssertSamples {
    @Test
    public void testAdd(){
        int num = 31;
        String temp = null;
        String str = "Junit is working fine.";
        String str2 = "Junit is working fine.";

        // Checks two references are equal
        assertEquals("Junit is working fine.", str);
        assertEquals(str, str2);

        // Checks a condition is false
        assertFalse(num > 32);

        // Checks a condition is true
        assertTrue(num == 31);

        // Checks an object is null
        assertNull(temp);


    }
}
