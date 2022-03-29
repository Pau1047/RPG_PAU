package Character.Item.Armor;

import Character.Job.Archer;
import Character.Stat.Constitution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondArmorTest {

    Archer archer1;

    @BeforeEach
    void setUp() {
        archer1 = new Archer();
    }

    @Test
    void getConstitution_ConstitutiomModifier_ConstitutionLess2() {
        assertEquals(-2, archer1.modifier(new Constitution(0)));
    }
}