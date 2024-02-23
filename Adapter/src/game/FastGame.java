package game;

import minion.NormalGameMinion;
import nexus.NormalGameNexus;
import tower.NormalGameTower;

public class FastGame {

    private NormalGameNexus nexus;
    private NormalGameTower towers;
    private NormalGameMinion minions;
    private boolean gameStarted;
    private int currentGameDuration;
    private int maxGameDuration;

    public void setCurrentGameDuration(int currentGameDuration) {
        this.currentGameDuration = currentGameDuration;
    }

    public FastGame() {
        this.nexus = new NormalGameNexus();
        this.towers = new NormalGameTower();
        this.minions = new NormalGameMinion();
        this.gameStarted = false;
        this.maxGameDuration = 10;
    }

    public void startGame() {
        nexus.setLifePoints(getHalfValue(nexus.getLifePoints()));
        minions.setLifePoints(getHalfValue(minions.getLifePoints()));
        towers.setLifePoints(getHalfValue(towers.getLifePoints()));
        gameStarted = true;
    }

    public boolean isGameFinished() {
        return currentGameDuration >= maxGameDuration || nexus.getLifePoints() == 0;
    }

    public int getMaxGameDuration() {
        return maxGameDuration;
    }

    private int getHalfValue(int value) {
        return value/2;
    }

}
