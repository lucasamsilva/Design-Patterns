package items;

import interfaces.HasStats;

public class BlackCleaver extends ItemsDecorator {

    public BlackCleaver(HasStats statsObject) {
        super(statsObject, 55, 0, 0, 0, 15);
    }

}
