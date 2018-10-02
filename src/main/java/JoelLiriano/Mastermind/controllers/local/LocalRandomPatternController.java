package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.controllers.RandomPatternController;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.Pattern;

public abstract class LocalRandomPatternController extends LocalPatternController implements RandomPatternController {

    protected LocalRandomPatternController(Game game) {
        super(game);
    }

    public abstract void getValue(Pattern pattern);
}
