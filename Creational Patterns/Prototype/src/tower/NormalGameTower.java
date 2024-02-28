package tower;

public class NormalGameTower implements Tower {

    int lifePoints = 1000;
    int damage = 50;

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalGameTower that = (NormalGameTower) o;

        if (lifePoints != that.lifePoints) return false;
        return damage == that.damage;
    }

    @Override
    public int hashCode() {
        int result = lifePoints;
        result = 31 * result + damage;
        return result;
    }
}
