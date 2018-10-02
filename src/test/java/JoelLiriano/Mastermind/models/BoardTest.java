package JoelLiriano.Mastermind.models;

import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    void testGetFeedback(){
        SecretPattern secretPattern = new SecretPattern();
        secretPattern.generateRandomValue();
        GuessPattern guessPattern = new GuessPattern();
        guessPattern.setManualValue("AZVB".toCharArray());
        Board board = new Board(secretPattern);

        System.out.println("Secret: "+secretPattern.getValueString());
        System.out.println("Turn "+board.getCurrentDisplayTurn()+" Guess: "+guessPattern.getValueString());
        System.out.println("-------------");
        board.setGuessPattern(guessPattern);
        board.getFeedback();
        System.out.println(board.getGuessFeedbackFromTurn(0));
    }
}
