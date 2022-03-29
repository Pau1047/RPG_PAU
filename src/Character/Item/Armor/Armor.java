package Character.Item.Armor;

import Character.Stat.Stat;

public abstract class Armor {

    //Devuelve el modificador de la professión segun el stat
    public abstract int modifier (Stat stat);

    @Override
    //Devuelve true si ya lleva armadura
    public boolean equals(Object obj){
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}