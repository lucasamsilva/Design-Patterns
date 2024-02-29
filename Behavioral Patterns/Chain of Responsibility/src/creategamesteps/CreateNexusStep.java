package creategamesteps;

import game.Game;
import nexus.ChristmasNexus;
import nexus.Nexus;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class CreateNexusStep extends CreateGameStep {

    public CreateNexusStep(CreateGameStep nextStep) {
        super(nextStep);
    }

    @Override
    public boolean creationSuccess(Game game) {
        Nexus blueNexus;
        Nexus redNexus;
        if(LocalDateTime.now().getMonth().equals(Month.DECEMBER)) {
            blueNexus = new ChristmasNexus();
            redNexus = new ChristmasNexus();
        } else {
            blueNexus = new Nexus();
            redNexus = new Nexus();
        }
        game.setNexus(List.of(blueNexus, redNexus));
        return checkNextStep(game);
    }
}
