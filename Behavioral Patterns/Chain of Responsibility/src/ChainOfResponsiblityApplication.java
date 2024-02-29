import creategamesteps.ConnectPlayersStep;
import creategamesteps.CreateMinionsStep;
import creategamesteps.CreateNexusStep;
import creategamesteps.CreateTowerStep;
import game.Game;
import player.Player;

import java.util.ArrayList;

public class ChainOfResponsiblityApplication {

    public static void main(String[] args) {
        var players = new ArrayList<Player>();
        for (int i = 0; i < 10; i++) {
            players.add(new Player(String.format("Player %d", i), String.format("192.168.0.%d", i)));
        }
        var game = new Game(players);

        var connectPlayerStep = new ConnectPlayersStep(null);
        var minionStep = new CreateMinionsStep(connectPlayerStep);
        var towerStep = new CreateTowerStep(minionStep);
        var nexusStep = new CreateNexusStep(towerStep);

        var result = nexusStep.creationSuccess(game);
        if(result) {
            System.out.println("Game created with success");
        } else {
            System.out.println("The game have failed");
        }
    }

}
