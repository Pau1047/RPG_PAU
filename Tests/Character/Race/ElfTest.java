package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    Elf elfone;

    @BeforeEach
    void setUp() {
        elfone = new Elf();
    }

    @Test
    void getDexterity_DexterityModifier_Dexterity3() {
        assertEquals(3, elfone.modifier(new Dexterity(0)));
    }

    @Test
    void getIntelligence_IntelligenceModifier_Intelligence3() {
        assertEquals(3, elfone.modifier(new Intelligence(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_ConstitutionLess1() {
        assertEquals(-1, elfone.modifier(new Constitution(0)));
    }
}