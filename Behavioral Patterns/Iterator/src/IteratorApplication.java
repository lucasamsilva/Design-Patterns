import item.BasicItem;
import item.ComposedItem;
import iterator.ComposedItemIterator;

public class IteratorApplication {

    public static void main(String[] args) {
        var longSword = new BasicItem("Long Sword", 10, 0, 0, 0, 0, 0);
        var glowingMote = new BasicItem("Glowing Mote", 0, 0, 0, 0, 0, 5);
        var rubyCrystal = new BasicItem("Ruby Crystal", 0, 0, 0, 0, 150, 0);
        var pickaxe = new BasicItem("Pickaxe", 25, 0, 0, 0, 0, 0);
        var clothArmor = new BasicItem("Cloth Armor", 0, 0, 15, 0, 0, 0);
        var nullMagicMantle = new BasicItem("Null-Magic Mantle", 0, 0, 0, 25, 0, 0);

        var caulfieldsWarhammer = new ComposedItem("Caulfield's Warhammer", 5, 0, 0, 0, 0, 5);
        caulfieldsWarhammer.add(longSword, glowingMote, longSword);

        var kindlegem = new ComposedItem("Kindlegem", 0, 0, 0, 0, 50, 5);
        kindlegem.add(rubyCrystal, glowingMote);

        var chainVest = new ComposedItem("Chain Vest", 0, 0, 25, 0, 0, 0);
        chainVest.add(clothArmor);

        var negatronCloak = new ComposedItem("Negatron Cloak", 0, 0, 0, 25, 0, 0);
        negatronCloak.add(nullMagicMantle);

        var spearOfShojin = new ComposedItem("Spear of Shojin", 5, 0, 0, 0, 100, 0);
        spearOfShojin.add(caulfieldsWarhammer, pickaxe, kindlegem);

        var jakSho = new ComposedItem("Jak'Sho", 0, 0, 10, 0, 150, 0);
        jakSho.add(chainVest, negatronCloak, rubyCrystal);

        iterateAboveItem(spearOfShojin, 0);
        iterateAboveItem(jakSho, 0);
    }

    private static void iterateAboveItem(ComposedItem item, int treeLevel) {
        var iterator = new ComposedItemIterator(item);
        printWithSpaces(item.getName(), treeLevel);
        while (iterator.hasNext()) {
            var currentItem = iterator.getNext();
            if(currentItem.getClass().equals(ComposedItem.class)) {
                iterateAboveItem((ComposedItem) currentItem, treeLevel + 1);
            } else {
                printWithSpaces(currentItem.getName(), treeLevel + 1);
            }
        }
    }

    private static void printWithSpaces(String text, int numberOfSpaces) {
        var i = 0;
        var spaces = new StringBuilder();
        while(i < numberOfSpaces) {
            i++;
            spaces.append(" ");
        }
        spaces.append("- ");
        System.out.println(spaces.append(text));
    }
}
