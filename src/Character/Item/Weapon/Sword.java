package Character.Item.Weapon;

import Character.Stat.Stat;
import Character.Stat.Strength;

public class Sword extends Weapon{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 3;
        }
        return 0;
    }
}
