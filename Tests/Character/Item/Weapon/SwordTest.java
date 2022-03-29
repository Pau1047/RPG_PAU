package Character.Item.Weapon;

import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordTest {


    Sword sword1;

    @BeforeEach
     void setUp() {
        sword1 = new Sword();
    }

    @Test
    void getStrength_StrengthModifier_Strength5() {
        assertEquals(3, sword1.modifier(new Strength(0)));
    }
}