package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.PatternControllerVisitor;
import JoelLiriano.Mastermind.controllers.RandomPatternController;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.GuessPattern;
import JoelLiriano.Mastermind.models.Pattern;

public class LocalRandomCodebreakerController extends LocalRandomPatternController implements RandomPatternController {

    public LocalRandomCodebreakerController(Game game){
        super(game);
    }

    @Override
    public void getValue(Pattern pattern) {
        pattern.generateRandomValue();
    }

    public void getValue(GuessPattern guessPattern) {
        guessPattern.generateRandomValue();
    }

    @Override
    public void accept(PatternControllerVisitor patternControllerVisitor) {
        patternControllerVisitor.visit(this);
    }

}
