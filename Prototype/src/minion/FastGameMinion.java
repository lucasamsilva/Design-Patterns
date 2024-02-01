package minion;

public class FastGameMinion implements Minion {

    int lifePoints = 1000;
    int damage = 10;
    int moveSpeed = 200;

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int getMoveSpeed() {
        return this.moveSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FastGameMinion that = (FastGameMinion) o;

        if (lifePoints != that.lifePoints) return false;
        if (damage != that.damage) return false;
        return moveSpeed == that.moveSpeed;
    }

    @Override
    public int hashCode() {
        int result = lifePoints;
        result = 31 * result + damage;
        result = 31 * result + moveSpeed;
        return result;
    }
}
