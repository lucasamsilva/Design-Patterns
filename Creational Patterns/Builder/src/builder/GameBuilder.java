package builder;

import game.Game;
import minion.Minion;
import nexus.Nexus;
import tower.Tower;

public interface GameBuilder {

    GameBuilder nexus(Nexus nexus);
    GameBuilder towers(Tower towers);
    GameBuilder minions(Minion minions);
    Game build();

}
