package factory;

import game.Game;
import minion.FastGameMinion;
import nexus.FastGameNexus;
import tower.FastGameTower;

public class FastGameFactory implements GameFactory {

    public Game createGame() {
        return new Game(new FastGameNexus(), new FastGameTower(), new FastGameMinion());
    }

}
