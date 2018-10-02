package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.GameplayController;
import JoelLiriano.Mastermind.controllers.GameplayControllerVisitor;
import JoelLiriano.Mastermind.controllers.OperationControllerVisitor;
import JoelLiriano.Mastermind.controllers.PatternController;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.GuessPattern;

public class LocalGameplayController extends LocalOperationController implements GameplayController {

    private LocalPatternController patternController;

    public LocalGameplayController(Game game, LocalPatternController patternController){
        super(game);
        assert patternController != null;
        this.patternController = patternController;
    }

    @Override
    public void getValue(GuessPattern guessPattern) { patternController.getValue(guessPattern);
    }

    @Override
    public PatternController getPatternController() {
        return patternController;
    }

    @Override
    public void accept(GameplayControllerVisitor gameplayControllerVisitor) {
        gameplayControllerVisitor.visit(this);
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }
}
