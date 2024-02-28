package items;

import interfaces.HasStats;

public class JakSho extends ItemsDecorator {

    public JakSho(HasStats statsObject) {
        super(statsObject, 0, 0, 40, 40, 0);
    }
}
