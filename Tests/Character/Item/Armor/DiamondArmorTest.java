package Character.Item.Armor;

import Character.Job.Archer;
import Character.Stat.Constitution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondArmorTest {

    DiamondArmor diamondArmor;

    @BeforeEach
    void setUp() {
         diamondArmor = new DiamondArmor();
    }

    @Test
    void getConstitution_ConstitutiomModifier_Constitution12() {
        assertEquals(12, diamondArmor.modifier(new Constitution(0)));
    }
}