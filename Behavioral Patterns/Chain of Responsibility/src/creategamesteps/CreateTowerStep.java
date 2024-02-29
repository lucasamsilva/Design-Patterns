package creategamesteps;

import game.Game;
import tower.ChristmasTower;
import tower.Tower;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class CreateTowerStep extends CreateGameStep {

    public CreateTowerStep(CreateGameStep nextStep) {
        super(nextStep);
    }

    @Override
    public boolean creationSuccess(Game game) {
        Tower blueTowers;
        Tower redTowers;
        if(LocalDateTime.now().getMonth().equals(Month.DECEMBER)) {
            blueTowers = new ChristmasTower();
            redTowers = new ChristmasTower();
        } else {
            blueTowers = new Tower();
            redTowers = new Tower();
        }
        game.setTowers(List.of(blueTowers, redTowers));
        return checkNextStep(game);
    }
}
