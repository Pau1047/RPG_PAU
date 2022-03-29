package Character.Item.Weapon;

import Character.Stat.Stat;

public abstract class Weapon {

        //Devuelve el modificador de la professión segun el stat
        public abstract int modifier (Stat stat);

        @Override
        //Devuelve true si son la misma arma
        public boolean equals(Object obj){
            return false;
        }

        @Override
        public String toString() {
            return super.toString();
        }

}
