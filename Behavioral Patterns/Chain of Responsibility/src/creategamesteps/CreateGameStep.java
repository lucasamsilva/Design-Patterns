package creategamesteps;

import game.Game;

public abstract class CreateGameStep {

    private CreateGameStep nextStep;

    protected CreateGameStep(CreateGameStep nextStep) {
        this.nextStep = nextStep;
    }

    public abstract boolean creationSuccess(Game game);

    protected boolean checkNextStep(Game game) {
        if (nextStep == null) {
            return true;
        }
        return nextStep.creationSuccess(game);
    }
}
