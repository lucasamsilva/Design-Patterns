package factory;

import minion.Minion;
import nexus.Nexus;
import tower.Tower;

public interface GameModeFactory {

    Minion getMinions();
    Nexus getNexus();
    Tower getTowers();

}
