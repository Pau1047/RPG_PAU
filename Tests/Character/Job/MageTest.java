package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    Mage mage1;

    @BeforeEach
    void setUp() {
        mage1 = new Mage();
    }

    @Test
    void getDexterity_DexterityModifier_Dexterity1() {
        assertEquals(1, mage1.modifier(new Dexterity(0)));
    }

    @Test
    void getIntelligence_IntelligenceModifier_Intelligence4() {
        assertEquals(4, mage1.modifier(new Intelligence(0)));
    }


}