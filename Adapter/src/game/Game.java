package game;

import minion.NormalGameMinion;
import nexus.NormalGameNexus;
import tower.NormalGameTower;

public class Game {

    private NormalGameNexus nexus;
    private NormalGameTower towers;
    private NormalGameMinion minions;
    private boolean gameStarted;

    public NormalGameNexus getNexus() {
        return nexus;
    }

    public Game() {
        this.nexus = new NormalGameNexus();
        this.towers = new NormalGameTower();
        this.minions = new NormalGameMinion();
        this.gameStarted = false;
    }

    public void startGame() {
        this.gameStarted = true;
        System.out.println("Game started");
    }

    public boolean isGameFinished() {
        return nexus.getLifePoints() == 0;
    }
}
