package Character.Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Stat;

public class IronArmor extends Armor{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution){
            return 8;
        }
        return 0;
    }
}
