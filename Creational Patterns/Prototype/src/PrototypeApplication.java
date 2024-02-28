import game.Game;
import minion.FastGameMinion;
import minion.NormalGameMinion;
import nexus.FastGameNexus;
import nexus.NormalGameNexus;
import tower.FastGameTower;
import tower.NormalGameTower;

public class PrototypeApplication {

    public static void main(String[] args) {
        var normalGameNexus = new NormalGameNexus();
        var normalGameTowers = new NormalGameTower();
        var normalGameMinions = new NormalGameMinion();

        var fastGameNexus = new FastGameNexus();
        var fastGameTowers = new FastGameTower();
        var fastGameMinions = new FastGameMinion();

        var normalGame = new Game(normalGameNexus, normalGameTowers, normalGameMinions);
        var normalGameClone = normalGame.clone();
        var fastGame = new Game(fastGameNexus, fastGameTowers, fastGameMinions);
        var fastGameClone = fastGame.clone();

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

        System.out.println("Starting Normal Game Clone");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + normalGameClone.getMinions().getMoveSpeed());
        System.out.println("Damage: " + normalGameClone.getMinions().getDamage());
        System.out.println("Life Points: " + normalGameClone.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + normalGameClone.getTowers().getDamage());
        System.out.println("Life Points: " + normalGameClone.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + normalGameClone.getNexus().getLifePoints());

        if(normalGameClone.equals(normalGame)) {
            System.out.println("The normal games are equal!!!!");
        }

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

        System.out.println("-------------------------------------------------");

        System.out.println("Starting Fast Game Clone");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + fastGameClone.getMinions().getMoveSpeed());
        System.out.println("Damage: " + fastGameClone.getMinions().getDamage());
        System.out.println("Life Points: " + fastGameClone.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + fastGameClone.getTowers().getDamage());
        System.out.println("Life Points: " + fastGameClone.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + fastGameClone.getNexus().getLifePoints());

        if(fastGameClone.equals(fastGame)) {
            System.out.println("The fast games are equal!!!!");
        }

        var mixedGame = fastGameClone.clone();
        mixedGame.setMinions(normalGameMinions);

        System.out.println("-------------------------------------------------");

        System.out.println("Starting Mixed Game Clone");
        System.out.println("Minions -> ");
        System.out.println("Move Speed: " + mixedGame.getMinions().getMoveSpeed());
        System.out.println("Damage: " + mixedGame.getMinions().getDamage());
        System.out.println("Life Points: " + mixedGame.getMinions().getLifePoints());
        System.out.println("Towers ->");
        System.out.println("Damage: " + mixedGame.getTowers().getDamage());
        System.out.println("Life Points: " + mixedGame.getMinions().getLifePoints());
        System.out.println("Nexus ->");
        System.out.println("Life Points: " + mixedGame.getNexus().getLifePoints());

        if(!mixedGame.equals(fastGameClone) && !mixedGame.equals(fastGame) && !mixedGame.equals(normalGame) && !mixedGame.equals(normalGameClone) ) {
            System.out.println("Mixed game is different of all other game types!");
        }
    }

}
