package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.ContinueController;
import JoelLiriano.Mastermind.controllers.OperationControllerVisitor;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.State;

public class LocalContinueController extends LocalOperationController implements ContinueController {

    public LocalContinueController(Game game){
        super(game);
    }

    public void resume(boolean another) {
        assert this.getState() == State.FINAL;
        if (another) {
            this.clear();
            this.setState(State.INITIAL);
        } else {
            this.setState(State.EXIT);
        }
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }
}
