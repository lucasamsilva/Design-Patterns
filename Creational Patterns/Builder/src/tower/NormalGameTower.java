package tower;

public class NormalGameTower implements Tower {

    @Override
    public int getLifePoints() {
        return 1000;
    }

    @Override
    public int getDamage() {
        return 50;
    }
}
