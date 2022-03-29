package Character.Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Stat;

public class GoldArmor extends Armor {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution){
            return 4;
        }
        return 0;
    }
}
