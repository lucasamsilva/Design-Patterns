package player.proxy;

import player.Player;
import player.PlayerImpl;

public class PlayerProxy implements Player {

    private Player realPlayer;
    private String name;

    public PlayerProxy(String name) {
        this.name = name;
    }

    @Override
    public void playGame() {
        if (realPlayer == null) {
            realPlayer = new PlayerImpl(name);
        }
        realPlayer.playGame();
    }

    @Override
    public void login() {
        if (realPlayer == null) {
            realPlayer = new PlayerImpl(name);
        }
        realPlayer.login();
    }

}
