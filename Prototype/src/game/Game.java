package game;

import minion.Minion;
import nexus.Nexus;
import tower.Tower;

public class Game implements CloneableGame {

    private Nexus nexus;
    private Tower towers;
    private Minion minions;

    public Game(Nexus nexus, Tower towers, Minion minions) {
        this.nexus = nexus;
        this.towers = towers;
        this.minions = minions;
    }

    public Nexus getNexus() {
        return nexus;
    }

    public void setNexus(Nexus nexus) {
        this.nexus = nexus;
    }

    public Tower getTowers() {
        return towers;
    }

    public void setTowers(Tower towers) {
        this.towers = towers;
    }

    public Minion getMinions() {
        return minions;
    }

    public void setMinions(Minion minions) {
        this.minions = minions;
    }

    @Override
    public CloneableGame clone() {
        return new Game(this.nexus, this.towers, this.minions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (!nexus.equals(game.nexus)) return false;
        if (!towers.equals(game.towers)) return false;
        return minions.equals(game.minions);
    }

    @Override
    public int hashCode() {
        int result = nexus.hashCode();
        result = 31 * result + towers.hashCode();
        result = 31 * result + minions.hashCode();
        return result;
    }
}
