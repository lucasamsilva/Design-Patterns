package nexus;

public class NormalGameNexus implements Nexus {

    int lifePoints = 4000;

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NormalGameNexus that = (NormalGameNexus) o;

        return lifePoints == that.lifePoints;
    }

    @Override
    public int hashCode() {
        return lifePoints;
    }

}
