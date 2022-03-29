package Character.Item.Food;

import Character.Character;
import Character.Item.IConsumable;

public abstract class Food implements IConsumable {
    protected double power;

    public Food ()
    {}

    public double getPower() {
        return power;
    }

    @Override
    public void consumedBy(Character character) {
        character.heals(this.power);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
