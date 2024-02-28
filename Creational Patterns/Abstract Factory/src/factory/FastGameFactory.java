package factory;

import minion.FastGameMinion;
import minion.Minion;
import nexus.FastGameNexus;
import nexus.Nexus;
import tower.FastGameTower;
import tower.Tower;

public class FastGameFactory implements GameModeFactory {

    @Override
    public Minion getMinions() {
        return new FastGameMinion();
    }

    @Override
    public Nexus getNexus() {
        return new FastGameNexus();
    }

    @Override
    public Tower getTowers() {
        return new FastGameTower();
    }
}
