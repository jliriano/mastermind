package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.OperationController;
import JoelLiriano.Mastermind.controllers.OperationControllerVisitor;
import JoelLiriano.Mastermind.models.Game;

public abstract class LocalOperationController extends LocalController
        implements OperationController {

    protected LocalOperationController(Game game) {
        super(game);
    }

    public abstract void accept(OperationControllerVisitor operationControllerVisitor);

}
