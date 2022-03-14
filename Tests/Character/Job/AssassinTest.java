package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssassinTest {

    Assassin assassi;

    @BeforeEach
    void setUp() {
        assassi = new Assassin();
    }

    @Test
    void getDexterity_DexterityModifier_Dexterity3() {
        assertEquals(3, assassi.modifier(new Dexterity(0)));
    }

    @Test
    void getStrength_StrengthModifier_Strength1() {
        assertEquals(1, assassi.modifier(new Strength(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_Constitution1() {
        assertEquals(1, assassi.modifier(new Constitution(0)));
    }
}