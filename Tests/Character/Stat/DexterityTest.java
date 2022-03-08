package Character.Stat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DexterityTest {

     int value = 10;
    Dexterity dex;

    @BeforeEach
    void setUp() {
        dex = new Dexterity(value);
    }

    @Test
    void Constructor_getValue_Value() {
        assertEquals(value, dex.getValue());
    }

    @Test
    void IValue_Increase_ValueIncrease1() {
        dex.increase();
        assertEquals(value+1, dex.getValue());
    }

    @Test
    void decrease() {
        dex.decrease();
        assertEquals(value-1, dex.getValue());
    }

    @Test
    void testToString() {
        String expected = "Dexterity: 10";
        assertEquals(expected, dex.toString());
    }
}