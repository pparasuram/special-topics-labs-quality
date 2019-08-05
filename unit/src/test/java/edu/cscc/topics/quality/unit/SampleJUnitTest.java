package edu.cscc.topics.quality.unit;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleJUnitTest {
    @Test
    public void simpleTest() {
        // JUnit has some convenience methods (like assertEquals) that compares to objects and gives a reasonable
        // error message if they are not (and fails the test)
        assertEquals("a.b", new SimpleJoiner().join(".", "a", "b"));
    }

    @Test
    public void shouldSkipNulls() {
        // Let's fix the code for this test.  Note that the test is correct.  It's the code that is implemented wrong.
        // TODO: make this test pass
        assertEquals("a.b", new SimpleJoiner().join(".", "a", null, "b"));
    }

    // Please fixup this method so that junit will run this test with the rest of the suite when running 'mvn test'
    // TODO: Fix this test so it will run
    public void thisShouldRunAsATest() {
        assertTrue(new SimpleJoiner().join("|", "a", "b").length() == 3);
    }

    /** Please modify the code and add a test to support passing <code>null</code> for parts
     *
     *  In this scenario the code should just return the <code>base</code> with no separators
     */
    // TODO: add this test case
}
