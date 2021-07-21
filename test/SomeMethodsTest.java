import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomeMethodsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testIndexValCalculation() {
        assertEquals(0, SomeMethods.weight_index(0,10));
        assertEquals(1,SomeMethods.weight_index(1,1));
        assertEquals(2,SomeMethods.weight_index(8,2));
        assertEquals(3,SomeMethods.weight_index(3,1));
    }
}