package game;

import minion.Minion;
import nexus.Nexus;
import player.Player;
import tower.Tower;

import java.util.List;

public class Game {

    private List<Tower> towers;
    private List<Minion> minions;
    private List<Nexus> nexus;
    private List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
    }

    public List<Tower> getTowers() {
        return towers;
    }

    public List<Minion> getMinions() {
        return minions;
    }

    public List<Nexus> getNexus() {
        return nexus;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setTowers(List<Tower> towers) {
        this.towers = towers;
    }

    public void setMinions(List<Minion> minions) {
        this.minions = minions;
    }

    public void setNexus(List<Nexus> nexus) {
        this.nexus = nexus;
    }
}
