package Character.Item.Weapon;

import Character.Stat.Stat;
import Character.Stat.Strength;

public class Gun extends Weapon{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 5;
        }
        return 0;
    }
}
