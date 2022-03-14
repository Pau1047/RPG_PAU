package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {

    Orc orc1;

    @BeforeEach
    void setUp() {
        orc1 = new Orc();
    }

    @Test
    void getStrength_StrengthModifier_Strength5() {
        assertEquals(5, orc1.modifier(new Strength(0)));
    }

    @Test
    void getIntelligence_IntelligenceModifier_IntelligenceLess3() {
        assertEquals(-3, orc1.modifier(new Intelligence(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_Constitution3() {
        assertEquals(3, orc1.modifier(new Constitution(0)));
    }
}