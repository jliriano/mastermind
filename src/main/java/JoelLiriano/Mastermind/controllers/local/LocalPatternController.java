package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.PatternController;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.Pattern;

public abstract class LocalPatternController extends LocalController implements PatternController {

    protected LocalPatternController(Game game) {
        super(game);
    }

    public abstract void getValue(Pattern pattern);
}
