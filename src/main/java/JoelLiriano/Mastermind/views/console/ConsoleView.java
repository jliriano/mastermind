package JoelLiriano.Mastermind.views.console;

import JoelLiriano.Mastermind.View;
import JoelLiriano.Mastermind.controllers.ContinueController;
import JoelLiriano.Mastermind.controllers.GameplayController;
import JoelLiriano.Mastermind.controllers.OperationController;
import JoelLiriano.Mastermind.controllers.StartController;

public class ConsoleView implements View {

    private StartView startView;

    private GameView gameView;

    private ContinueView continueView;

    public ConsoleView(){
        startView = new StartView();
        gameView = new GameView();
        continueView = new ContinueView();
    }

    public void interact(OperationController operationController) {
        assert operationController != null;
        operationController.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startView.interact(startController);
    }

    @Override
    public void visit(GameplayController gameplayController) {
        gameView.interact(gameplayController);
    }

    @Override
    public void visit(ContinueController continueController) {
        continueView.interact(continueController);
    }
}
