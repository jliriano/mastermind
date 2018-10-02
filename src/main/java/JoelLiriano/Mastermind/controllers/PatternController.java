package JoelLiriano.Mastermind.controllers;

public interface PatternController {

    void accept(PatternControllerVisitor patternControllerVisitor);

    int getCurrentTurn();
}
