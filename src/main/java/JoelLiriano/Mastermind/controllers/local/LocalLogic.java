package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.Logic;
import JoelLiriano.Mastermind.models.Game;

public class LocalLogic implements Logic {
    private Game game;
    private LocalStartController startController;
    private LocalGameplayControllerBuilder gameplayController;
    private LocalContinueController continueController;

    public LocalLogic() {
        game = new Game();
        gameplayController = new LocalGameplayControllerBuilder(game);
        startController = new LocalStartController(game,gameplayController);
        continueController = new LocalContinueController(game);
    }

    public LocalOperationController getOperationController () {
        switch (game.getState()) {
            case INITIAL:
                return startController;
            case IN_GAME:
                return gameplayController.getOperationController();
            case FINAL:
                return continueController;
            case EXIT:
            default:
                return null;
        }
    }
}
