package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstitutionTest {

    int value = 10;
    Constitution cons;

    @BeforeEach
    void setUp() {
        cons = new Constitution(value);
    }

    @Test
    void Constructor_getValue_Value() {
        assertEquals(value, cons.getValue());
    }

    @Test
    void IValue_Increase_ValueIncrease1() {
        cons.increase();
        assertEquals(value+1, cons.getValue());
    }

    @Test
    void decrease() {
        cons.decrease();
        assertEquals(value-1, cons.getValue());
    }

    @Test
    void testToString() {
        String expected = "Constitution: 10";
        assertEquals(expected, cons.toString());
    }
}