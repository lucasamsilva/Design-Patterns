package minion;

public class FastGameMinion implements Minion {

    @Override
    public int getLifePoints() {
        return 1000;
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public int getMoveSpeed() {
        return 200;
    }
}
