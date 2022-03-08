package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntelligenceTest {

    int value = 10;
    Intelligence intl;

    @BeforeEach
    void setUp() {
        intl = new Intelligence(value);
    }

    @Test
    void Constructor_getValue_Value() {
        assertEquals(value, intl.getValue());
    }

    @Test
    void IValue_Increase_ValueIncrease1() {
        intl.increase();
        assertEquals(value+1, intl.getValue());
    }

    @Test
    void decrease() {
        intl.decrease();
        assertEquals(value-1, intl.getValue());
    }

    @Test
    void testToString() {
        String expected = "Intelligence: 10";
        assertEquals(expected, intl.toString());
    }
}