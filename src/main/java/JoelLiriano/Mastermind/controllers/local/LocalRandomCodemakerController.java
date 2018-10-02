package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.PatternControllerVisitor;
import JoelLiriano.Mastermind.controllers.RandomPatternController;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.Pattern;
import JoelLiriano.Mastermind.models.SecretPattern;

public class LocalRandomCodemakerController extends LocalRandomPatternController implements RandomPatternController {

    public LocalRandomCodemakerController(Game game){
        super(game);
    }

    @Override
    public void getValue(Pattern pattern) {
        pattern.generateRandomValue();
    }

    public void getValue(SecretPattern secretPattern) {
        secretPattern.generateRandomValue();
    }

    @Override
    public void accept(PatternControllerVisitor patternControllerVisitor) {
        patternControllerVisitor.visit(this);
    }
}
