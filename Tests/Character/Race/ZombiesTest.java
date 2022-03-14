package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZombiesTest {

    Zombies zombi;

    @BeforeEach
    void setUp() {
        zombi = new Zombies();
    }

    @Test
    void getStrength_StrengthModifier_Strength4() {
        assertEquals(4, zombi.modifier(new Strength(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_Constitution2() {
        assertEquals(2, zombi.modifier(new Constitution(0)));
    }

    @Test
    void getDexterity_DexterityModifier_DexterityLess1() {
        assertEquals(-1, zombi.modifier(new Dexterity(0)));
    }
}