package items;

import interfaces.HasStats;

public class Rabadon extends ItemsDecorator {

    public Rabadon(HasStats statsObject) {
        super(statsObject, 0, 120, 0, 0, 0);
    }
}
