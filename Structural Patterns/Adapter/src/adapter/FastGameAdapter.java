package adapter;

import game.FastGame;
import game.Game;

public class FastGameAdapter extends Game {

    private FastGame fastGame;

    public FastGameAdapter(FastGame fastGame) {
        this.fastGame = fastGame;
    }

    public void startGame() {
        fastGame.startGame();
    }

    public boolean isGameFinished() {
        return fastGame.isGameFinished();
    }
}
