package tower;

public class FastGameTower implements Tower {

    @Override
    public int getLifePoints() {
        return 500;
    }

    @Override
    public int getDamage() {
        return 100;
    }
}
