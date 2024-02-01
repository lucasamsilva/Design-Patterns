package nexus;

public class FastGameNexus implements Nexus {

    int lifePoints = 2000;

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FastGameNexus that = (FastGameNexus) o;

        return lifePoints == that.lifePoints;
    }

    @Override
    public int hashCode() {
        return lifePoints;
    }
}
