package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrengthTest {

    int value = 10;
    Strength str;

    @BeforeEach
    void setUp() {
        str = new Strength(value);
    }

    @Test
    void Constructor_getValue_Value() {
        assertEquals(value, str.getValue());
    }

    @Test
    void IValue_Increase_ValueIncrease1() {
        str.increase();
        assertEquals(value+1,str.getValue());
    }

    @Test
    void decrease() {
        str.decrease();
        assertEquals(value-1,str.getValue());
    }

    @Test
    void testToString() {
        String expected = "Strength: 10";
        assertEquals(expected, str.toString());
    }
}