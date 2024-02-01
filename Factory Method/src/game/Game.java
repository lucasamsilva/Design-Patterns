package game;

import minion.Minion;
import nexus.Nexus;
import tower.Tower;

public class Game {

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
}
