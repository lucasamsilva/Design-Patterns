import game.Game;
import minion.FastGameMinion;
import minion.NormalGameMinion;
import nexus.FastGameNexus;
import nexus.NormalGameNexus;
import tower.FastGameTower;
import tower.NormalGameTower;

public class FactoryMethodApplication {

    public static void main(String[] args) {
        var normalGameNexus = new NormalGameNexus();
        var normalGameTowers = new NormalGameTower();
        var normalGameMinions = new NormalGameMinion();

        var fastGameNexus = new FastGameNexus();
        var fastGameTowers = new FastGameTower();
        var fastGameMinions = new FastGameMinion();

        var normalGame = new Game(normalGameNexus, normalGameTowers, normalGameMinions);
        var fastGame = new Game(fastGameNexus, fastGameTowers, fastGameMinions);

        System.out.println("Starting Normal Game");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + normalGame.getMinions().getMoveSpeed());
        System.out.println("Damage: " + normalGame.getMinions().getDamage());
        System.out.println("Life Points: " + normalGame.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + normalGame.getTowers().getDamage());
        System.out.println("Life Points: " + normalGame.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + normalGame.getNexus().getLifePoints());

        System.out.println("-------------------------------------------------");

        System.out.println("Starting Fast Game");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + fastGame.getMinions().getMoveSpeed());
        System.out.println("Damage: " + fastGame.getMinions().getDamage());
        System.out.println("Life Points: " + fastGame.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + fastGame.getTowers().getDamage());
        System.out.println("Life Points: " + fastGame.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + fastGame.getNexus().getLifePoints());
    }

}
