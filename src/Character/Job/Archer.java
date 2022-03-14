package Character.Job;

import Character.Stat.*;

public class Archer extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 4;
        }
        if (stat instanceof Constitution){
            return -2;
        }
        if(stat instanceof Dexterity){
            return 3;
        }

        return 0;
    }
}
