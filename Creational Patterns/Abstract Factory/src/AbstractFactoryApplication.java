import factory.FastGameFactory;
import factory.GameModeFactory;
import factory.NormalGameFactory;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        GameModeFactory normalGame = new NormalGameFactory();
        GameModeFactory fastGame = new FastGameFactory();

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
