package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.ManualPatternController;
import JoelLiriano.Mastermind.controllers.PatternControllerVisitor;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.GuessPattern;
import JoelLiriano.Mastermind.models.Pattern;

public class LocalManualCodebreakerController extends LocalManualPatternController implements ManualPatternController {

    public LocalManualCodebreakerController(Game game){
        super(game);
    }

    @Override
    public void getValue(Pattern pattern){
        pattern.getValue();
    }

    public void getValue(GuessPattern guessPattern) {
        guessPattern.generateRandomValue();
    }

    @Override
    public void accept(PatternControllerVisitor patternControllerVisitor) {
        patternControllerVisitor.visit(this);
    }
}
