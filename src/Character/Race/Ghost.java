package Character.Race;

import Character.Stat.*;

public class Ghost extends Race{


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity){
            return 4;
        }
        if (stat instanceof Intelligence){
            return 7;
        }
        if (stat instanceof Constitution){
            return -5;
        }
        if (stat instanceof Strength){
            return -1;
        }
        return 0;
    }
}
