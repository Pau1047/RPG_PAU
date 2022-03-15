package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    Warrior warrior1;

    @BeforeEach
    void setUp() {
        warrior1 = new Warrior();
    }

    @Test
    void getStrength_StrengthModifier_Strength() {
        assertEquals(3, warrior1.modifier(new Strength(0)));
    }

    @Test
    void getConstitution_ConstitutionModifier_Constitution2() {
        assertEquals(2, warrior1.modifier(new Constitution(0)));
    }
}