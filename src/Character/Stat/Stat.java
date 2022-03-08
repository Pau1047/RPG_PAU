package Character.Stat;

public abstract class Stat {

    private int value;

    public Stat(int value) {
        this.value = value;
    }

    //Devuelve el valor actual de la caracteristica
    public int getValue() {
        return value;
    }

    //Aumenta el valor de la caracteristica en 1
    public void increase() {
        value++;
    }

    //Disimuye el valor de la caracteristica en 1
    public void decrease() {
        value--;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + value;
    }
}
