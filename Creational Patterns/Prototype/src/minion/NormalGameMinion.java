package minion;

public class NormalGameMinion implements Minion {

    int lifePoints = 500;
    int damage = 5;
    int moveSpeed = 100;

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

        NormalGameMinion that = (NormalGameMinion) o;

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
