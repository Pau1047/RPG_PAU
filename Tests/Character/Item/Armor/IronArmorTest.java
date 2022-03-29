package Character.Item.Armor;

import Character.Stat.Constitution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IronArmorTest {

    IronArmor ironArmor;

    @BeforeEach
    void setUp() {
        ironArmor = new IronArmor();
    }

    @Test
    void getConstitution_ConstitutiomModifier_Constitution8() {
        assertEquals(8, ironArmor.modifier(new Constitution(0)));
    }
}