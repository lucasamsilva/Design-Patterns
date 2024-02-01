package builder;

import game.Game;
import minion.Minion;
import nexus.Nexus;
import tower.Tower;

public class GameBuilderImpl implements GameBuilder {

    private Game game;

    public GameBuilderImpl() {
        game = new Game();
    }

    @Override
    public GameBuilder nexus(Nexus nexus) {
        game.setNexus(nexus);
        return this;
    }

    @Override
    public GameBuilder towers(Tower towers) {
        game.setTowers(towers);
        return this;
    }

    @Override
    public GameBuilder minions(Minion minions) {
        game.setMinions(minions);
        return this;
    }

    @Override
    public Game build() {
        return game;
    }
}
