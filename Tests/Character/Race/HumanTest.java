package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human1;

    @BeforeEach
    void setUp() {
        human1 = new Human();
    }

    @Test
    void getStrength_StrengthModifier_Strength2() {
        assertEquals(2, human1.modifier(new Strength(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_Constitution2() {
        assertEquals(2, human1.modifier(new Constitution(0)));
    }

    @Test
    void getDexterity_DexterityModifier_MoreDexterity() {
        assertEquals(1, human1.modifier(new Dexterity(0)));
    }
}