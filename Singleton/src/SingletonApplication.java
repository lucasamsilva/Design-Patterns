import game.GameType;
import singleton.GameCreatorSingleton;

public class SingletonApplication {

    public static void main(String[] args) throws Exception {
        var gameCreatorSingleton = GameCreatorSingleton.getGameCreator();
        var normalGame = gameCreatorSingleton.createGame(GameType.NORMAL_GAME);
        var fastGame = gameCreatorSingleton.createGame(GameType.FAST_GAME);

        var gameCreatorSingleton2 = GameCreatorSingleton.getGameCreator();

        if(gameCreatorSingleton2 == gameCreatorSingleton) {
            System.out.println("The game creators are the same");
        }

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
