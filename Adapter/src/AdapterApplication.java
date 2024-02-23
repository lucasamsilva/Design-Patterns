import adapter.FastGameAdapter;
import game.FastGame;
import game.Game;
import service.GameControlService;

public class AdapterApplication {

    public static void main(String[] args) {

        var gameControlService = new GameControlService();
        var game = new Game();
        var fastGame = new FastGame();
        var fastGameAdapter = new FastGameAdapter(fastGame);

        // Works!
        gameControlService.startGame(game);
        game.getNexus().setLifePoints(0);
        gameControlService.finishGame(game);

        System.out.println("\n-----------------------------------\n");

        // Does not compile
        // gameControlService.startGame(fastGame);
        // gameControlService.startGame(fastGame);

        // Works!
        gameControlService.startGame(fastGameAdapter);
        fastGame.setCurrentGameDuration(10000);
        gameControlService.finishGame(fastGameAdapter);
    }

}
