package adapter;

import game.FastGame;
import game.Game;

public class FastGameAdapter extends Game {

    private FastGame fastGame;

    public FastGameAdapter(FastGame fastGame) {
        this.fastGame = fastGame;
    }

    @Override
    public void startGame() {
        fastGame.startGame();
    }

    @Override
    public boolean isGameFinished() {
        return fastGame.isGameFinished();
    }
}
