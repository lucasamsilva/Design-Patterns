package creategamesteps;

import game.Game;
import player.Player;

public class ConnectPlayersStep extends CreateGameStep {

    public ConnectPlayersStep(CreateGameStep nextStep) {
        super(nextStep);
    }

    @Override
    public boolean creationSuccess(Game game) {
        var players = game.getPlayers();
        try {
            players.forEach(this::connectPlayer);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return checkNextStep(game);
    }

    private void connectPlayer(Player player) {
        player.connect();
    }
}
