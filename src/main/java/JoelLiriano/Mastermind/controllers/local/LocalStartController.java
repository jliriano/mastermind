package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.OperationControllerVisitor;
import JoelLiriano.Mastermind.controllers.StartController;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.State;

public class LocalStartController extends LocalOperationController implements StartController {

    private LocalGameplayControllerBuilder localGameplayControllerBuilder;

    public LocalStartController(Game game, LocalGameplayControllerBuilder gameplayControllerBuilder){
        super(game);
        assert gameplayControllerBuilder != null;
        this.localGameplayControllerBuilder = gameplayControllerBuilder;
    }

    @Override
    public void start(int gameMode) {
        assert this.getState() == State.INITIAL;
        localGameplayControllerBuilder.build(gameMode);
        this.clear();
        this.setSecretPattern();
        this.setState(State.IN_GAME);
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }
}
