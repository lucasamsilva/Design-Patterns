package service;

import game.Game;

public class GameControlService {

    public void startGame(Game game) {
        System.out.println("Waiting for the players");
        System.out.println("Placing nexus");
        System.out.println("Placing Towers");
        game.startGame();
        System.out.println("Spawning minions");
    }

    public void finishGame(Game game) {
        if(game.isGameFinished()) {
            System.out.println("Showing result");
            System.out.println("Desconecting players");
            System.out.println("Game Finished");
        }
    }

}
