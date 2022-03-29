package Character.Item.Weapon;

import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {

    Knife knife1;

    @BeforeEach
    void setUp() {
        knife1 = new Knife();
    }

    @Test
    void getStrength_StrengthModifier_Strength1() {
        assertEquals(1, knife1.modifier(new Strength(0)));
    }
}