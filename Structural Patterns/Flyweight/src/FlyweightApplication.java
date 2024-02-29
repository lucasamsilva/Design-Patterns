import minion.Minion;
import minion.MinionFactory;
import minion.MinionModel;

import java.util.ArrayList;

public class FlyweightApplication {

    public static void main(String[] args) {
        var minionQuantity = 1000;
        var redMinions = new ArrayList<>();
        var blueMinions = new ArrayList<>();

        for (int i = 0; i < minionQuantity; i++) {
            var minionModel = MinionFactory.getMinionModel("red");
            redMinions.add(new Minion(minionModel));
        }

        for (int i = 0; i < minionQuantity; i++) {
            var minionModel = MinionFactory.getMinionModel("blue");
            blueMinions.add(new Minion(minionModel));
        }

        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Used memory with flyweight: " + (usedMemory / 1024 / 1024) + " MB");

        blueMinions = new ArrayList<>();
        redMinions = new ArrayList<>();

        for (int i = 0; i < minionQuantity; i++) {
            var minionModel = new MinionModel("red");
            redMinions.add(new Minion(minionModel));
        }

        for (int i = 0; i < minionQuantity; i++) {
            var minionModel = new MinionModel("blue");
            blueMinions.add(new Minion(minionModel));
        }

        totalMemory = Runtime.getRuntime().totalMemory();
        freeMemory = Runtime.getRuntime().freeMemory();
        usedMemory = totalMemory - freeMemory - usedMemory;

        System.out.println("Used memory without flyweight: " + (usedMemory / 1024 / 1024) + " MB");
    }

}
