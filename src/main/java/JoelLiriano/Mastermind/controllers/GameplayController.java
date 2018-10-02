package JoelLiriano.Mastermind.controllers;

import JoelLiriano.Mastermind.models.Board;
import JoelLiriano.Mastermind.models.GuessPattern;

public interface GameplayController extends OperationController,
        PresenterController {

    int getCurrentTurn();

    String getSecretString();

    void nextTurn();

    boolean existMatch();

    boolean turnsComplete();

    void getValue(GuessPattern guessPattern);

    PatternController getPatternController();

    Board getBoard();

    char[] getSecret();

    void accept(GameplayControllerVisitor gameplayControllerVisitor);

}
