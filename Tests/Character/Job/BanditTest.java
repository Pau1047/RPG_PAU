package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanditTest {

    Bandit bandit1;

    @BeforeEach
    void setUp() {
        bandit1 = new Bandit();
    }

    @Test
    void getStrength_StrengthModifier_Strength2() {
        assertEquals(2, bandit1.modifier(new Strength(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_Constiotution1() {
        assertEquals(1, bandit1.modifier(new Constitution(0)));
    }

    @Test
    void getDexterity_DexterityModifier_Dexterity2() {
        assertEquals(2, bandit1.modifier(new Dexterity(0)));
    }
}