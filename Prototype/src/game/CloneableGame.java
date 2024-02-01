package game;

import minion.Minion;
import nexus.Nexus;
import tower.Tower;

public interface CloneableGame {

    Nexus getNexus();
    void setNexus(Nexus nexus);
    Tower getTowers();
    void setTowers(Tower towers);
    Minion getMinions();
    void setMinions(Minion minions);
    CloneableGame clone();

}
