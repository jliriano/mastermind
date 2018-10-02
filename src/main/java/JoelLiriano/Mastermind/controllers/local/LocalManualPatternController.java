package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.ManualPatternController;
import JoelLiriano.Mastermind.controllers.PatternControllerVisitor;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.Pattern;

public class LocalManualPatternController extends LocalPatternController implements ManualPatternController {

    public LocalManualPatternController(Game game){
        super(game);
    }

    @Override
    public void getValue(Pattern pattern){
        //
    }

    @Override
    public void accept(PatternControllerVisitor patternControllerVisitor) {
        patternControllerVisitor.visit(this);
    }
}
