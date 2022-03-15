package Character;

public interface IDamage {

    double maxHealth();

    double health();

    boolean isDead();

    void recivesDamage(double amount);

    void heals(double amount);
}
