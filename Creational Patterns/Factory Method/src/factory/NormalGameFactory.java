package factory;

import game.Game;
import minion.NormalGameMinion;
import nexus.NormalGameNexus;
import tower.NormalGameTower;

public class NormalGameFactory implements GameFactory {

    public Game createGame() {
        return new Game(new NormalGameNexus(), new NormalGameTower(), new NormalGameMinion());
    }

}
