package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GhostTest {

    Ghost ghost1;

    @BeforeEach
    void setUp() {
        ghost1 = new Ghost();
    }

    @Test
    void getDexterity_DexterityModifier_Dexterity4() {
        assertEquals(4, ghost1.modifier(new Dexterity(0)));
    }

    @Test
    void getIntelligence_IntelligenceModifier_Intelligence7() {
        assertEquals(7, ghost1.modifier(new Intelligence(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_ConstitutionLess5() {
        assertEquals(-5, ghost1.modifier(new Constitution(0)));
    }

    @Test
    void getStrength_StrengthModifier_StrengthLess1() {
        assertEquals(-1, ghost1.modifier(new Strength(0)));
    }
}