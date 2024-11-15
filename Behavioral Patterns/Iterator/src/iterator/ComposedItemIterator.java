package iterator;

import item.ComposedItem;
import item.Item;

public class ComposedItemIterator implements Iterator {

    private ComposedItem item;
    private int currentPosition = 0;

    public ComposedItemIterator(ComposedItem item) {
        this.item = item;
    }

    @Override
    public boolean hasNext() {
        return item.getItemsToBuild().size() > currentPosition;
    }

    @Override
    public Item getNext() {
        if(!hasNext()) {
            return null;
        }
        var next = item.getItemsToBuild().get(currentPosition);
        currentPosition++;
        return next.getClass().isInstance(ComposedItem.class) ? new ComposedItemIterator((ComposedItem) next).getNext() : next;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
