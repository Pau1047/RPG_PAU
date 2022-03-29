package Character.Item.Armor;

import Character.Stat.Constitution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldArmorTest {

    GoldArmor goldArmor;

    @BeforeEach
    void setUp() {
        goldArmor = new GoldArmor();
    }

    @Test
    void getConstitution_ConstitutiomModifier_Constitution4() {
        assertEquals(4, goldArmor.modifier(new Constitution(0)));
    }
}