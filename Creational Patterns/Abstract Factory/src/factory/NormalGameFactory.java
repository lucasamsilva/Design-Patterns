package factory;

import minion.Minion;
import minion.NormalGameMinion;
import nexus.Nexus;
import nexus.NormalGameNexus;
import tower.NormalGameTower;
import tower.Tower;

public class NormalGameFactory implements GameModeFactory {

    @Override
    public Minion getMinions() {
        return new NormalGameMinion();
    }

    @Override
    public Nexus getNexus() {
        return new NormalGameNexus();
    }

    @Override
    public Tower getTowers() {
        return new NormalGameTower();
    }
}
