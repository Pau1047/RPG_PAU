package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {

    int value = 10;
    Stat stat;

    @BeforeEach
    void setUp() {
        stat = new StatMock(value);
    }

    @Test
    void Constructor_getValue_Value() {
        assertEquals(value, stat.getValue());
    }

    @Test
    void IValue_Increase_ValueIncrease1() {
        stat.increase();
        assertEquals(value+1, stat.getValue());
    }

    @Test
    void decrease() {
        stat.decrease();
        assertEquals(value-1, stat.getValue());
    }

    @Test
    void testToString() {
        String expected = "Intelligence: 10";
        assertEquals(expected, stat.toString());
    }
}