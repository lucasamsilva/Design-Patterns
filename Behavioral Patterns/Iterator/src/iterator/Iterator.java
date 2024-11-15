package iterator;

import item.Item;

public interface Iterator {

    boolean hasNext();

    Item getNext();

    void reset();

}
