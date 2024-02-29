package creategamesteps;

import game.Game;
import minion.ChristmasMinion;
import minion.Minion;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class CreateMinionsStep extends CreateGameStep {

    public CreateMinionsStep(CreateGameStep nextStep) {
        super(nextStep);
    }

    @Override
    public boolean creationSuccess(Game game) {
        Minion blueMinions;
        Minion redMinions;
        if(LocalDateTime.now().getMonth().equals(Month.DECEMBER)) {
            blueMinions = new ChristmasMinion();
            redMinions = new ChristmasMinion();
        } else {
            blueMinions = new Minion();
            redMinions = new Minion();
        }
        game.setMinions(List.of(blueMinions, redMinions));
        return checkNextStep(game);
    }
}
