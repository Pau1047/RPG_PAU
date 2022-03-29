package Character.Item.Potion;

import Character.Item.IConsumable;
import Character.Character;

public abstract class Potion implements IConsumable {
    protected int power;

    public Potion(){
    }

    public int getPower() {
        return power;
    }

    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
