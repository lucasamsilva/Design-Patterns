package singleton;

import factory.FastGameFactory;
import factory.NormalGameFactory;
import game.Game;
import game.GameType;

public class GameCreatorSingleton {

    private static GameCreatorSingleton gameCreator;

    private GameCreatorSingleton() {
    }

    public Game createGame(GameType gameType) throws Exception {
        if(gameType.equals(GameType.NORMAL_GAME)) {
            return new NormalGameFactory().createGame();
        }
        if(gameType.equals(GameType.FAST_GAME)) {
            return new FastGameFactory().createGame();
        }
        throw new Exception("Invalid Game Type");
    }

    public static GameCreatorSingleton getGameCreator() {
        if(gameCreator != null) {
            return gameCreator;
        }
        gameCreator = new GameCreatorSingleton();
        return gameCreator;
    }
}
