package Character.Item.Weapon;

import Character.Stat.Stat;
import Character.Stat.Strength;

public class Knife  extends Weapon{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 1;
        }
        return 0;
    }
}
