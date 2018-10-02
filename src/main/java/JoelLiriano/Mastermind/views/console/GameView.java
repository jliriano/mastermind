package JoelLiriano.Mastermind.views.console;

import JoelLiriano.Mastermind.controllers.GameplayController;
import JoelLiriano.Mastermind.controllers.GameplayControllerVisitor;
import JoelLiriano.Mastermind.controllers.PatternController;
import JoelLiriano.Mastermind.controllers.OperationController;
import JoelLiriano.Mastermind.models.GuessPattern;
import JoelLiriano.Mastermind.models.Turn;
import JoelLiriano.Mastermind.utils.IO;

class GameView implements GameplayControllerVisitor {

    private IO io = new IO();
    private Turn turn;

    private GuessPattern guessPattern;

    public void interact(GameplayController gameplayController) {
        String secret = gameplayController.getSecretString();
        System.out.println("Secreto: "+secret);
        System.out.println("Turno "+gameplayController.getBoard().getCurrentDisplayTurn());
        guessPattern = new GuessPattern();
        guessPattern.requestManualValue();
        gameplayController.getBoard().setGuessPattern(guessPattern);
        if (gameplayController.getBoard().matchSecret(gameplayController.getSecret())) {
            System.out.println("Victoria!!! Has descubierto el codigo secreto!");
        }
        if (gameplayController.turnsComplete()) {
            System.out.println("Derrota! El codigo secreto era: "+gameplayController.getSecretString());
        } else {
            gameplayController.nextTurn();
        }
    }

    @Override
    public void visit(PatternController patternController) {
        //pattern controller
    }

    @Override
    public void visit(OperationController operationController) {
        //operation controller
    }
}