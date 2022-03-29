package Character.Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Stat;

public class DiamondArmor extends Armor{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution){
            return 12;
        }
        return 0;
    }
}
