package Character.Item.Weapon;

import Character.Job.Archer;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {

    Gun gun1;

    @BeforeEach
    void setUp() {
       gun1 = new Gun();
    }

    @Test
    void getStrength_StrengthModifier_Strength5() {
        assertEquals(5, gun1.modifier(new Strength(0)));
    }

}