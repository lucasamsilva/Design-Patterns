package minion;

public class NormalGameMinion implements Minion {

    @Override
    public int getLifePoints() {
        return 500;
    }

    @Override
    public int getDamage() {
        return 5;
    }

    @Override
    public int getMoveSpeed() {
        return 100;
    }
}
