package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    Archer archer1;

    @BeforeEach
    void setUp() {
        archer1 = new Archer();
    }

    @Test
    void getIntelligence_IntelligenceModifier_Intelligence4() {
        assertEquals(4, archer1.modifier(new Intelligence(0)));
    }

    @Test
    void getConstitution_ConstitutiomModifier_ConstitutionLess2() {
        assertEquals(-2, archer1.modifier(new Constitution(0)));
    }

    @Test
    void getDexterity_DexterityModifier_Dexterity3() {
        assertEquals(3, archer1.modifier(new Dexterity(0)));
    }
}