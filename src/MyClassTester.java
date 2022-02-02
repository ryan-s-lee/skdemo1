import org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class MyClassTester {
    @Test
    public void testBruh() {
        // default constructor for speed and convenience
        MyClass myclass = new MyClass();
        assertTrue("True brothers", myclass.bruh());
    }
}
