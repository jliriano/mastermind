package JoelLiriano.Mastermind.models;

import java.util.Arrays;

public class Board {

    private GuessPattern[] allGuessPatterns;
    private String[] allGuessFeedback;
    private SecretPattern secretPattern;
    private Turn turn = new Turn();
    private int maxTurns = turn.getMaxTurns();
    private static final int MAX_COLORS = Color.getMaxInputColors();

    public Board(SecretPattern secretPattern){
        assert secretPattern != null;
        this.secretPattern = secretPattern;
        allGuessPatterns = new GuessPattern[maxTurns];
        allGuessFeedback = new String[maxTurns];
    }

    public void setGuessPattern( GuessPattern guessPattern){
        allGuessPatterns[turn.current()] = guessPattern;
    }

    public void setGuessFeedback(int currentTurn, String feedback){
        assert feedback!=null;
        allGuessFeedback[currentTurn] = feedback;
    }

    public void getFeedback(){
        char[] currentGuessPattern = allGuessPatterns[turn.current()].value;
        if(matchSecret(secretPattern.value)){
            allGuessFeedback[turn.current()] = "VICTORIA! "+currentGuessPattern.toString()+" = "+secretPattern.value.toString();
        } else {
            int hurt = getHurt(secretPattern.getValue());
            int dead = getDead(secretPattern.getValue());
            allGuessFeedback[turn.current()] = dead+" muertos y "+hurt+" heridos.";
        }
    }

    public int getDead(char[] secret){
        int dead = 0;
        char[] currentGuess = allGuessPatterns[turn.current()].value;
        for(int i=0; i<MAX_COLORS; i++){
            if(secret[i]==currentGuess[i]){
                dead++;
            }
        }
        return dead;
    }

    public int getHurt(char[] secret){
        int hurt = 0;
        int currentTurn = turn.current();
        int dead = getDead(secret);
        int editedArrayLength = MAX_COLORS-dead;
        char[] editedSecret = new char[editedArrayLength];
        char[] editedGuess = new char[editedArrayLength];
        int currentEditedIndex = 0;
        for(int i=0; i<MAX_COLORS; i++) {
            if(secret[i]!=allGuessPatterns[currentTurn].value[i]){
                editedSecret[currentEditedIndex] = secret[i];
                editedGuess[currentEditedIndex] = allGuessPatterns[currentTurn].value[i];
                currentEditedIndex++;
            }
        }
        for(int i=0; i < editedSecret.length; i++){
            for(int j=0; j < editedGuess.length; j++){
                if(editedSecret[i]==editedGuess[j]){
                    hurt++;
                    editedGuess[j] = 'x';
                    break;
                }
            }
        }
        return hurt;
    }

    public boolean matchSecret(char[] secret){
        char[] currentGuessPattern = allGuessPatterns[turn.current()].value;
        if(currentGuessPattern.equals(secret)){
            return true;
        }
        return false;
    }

    public String getGuessPatternValueFromTurn(int turn){
        return Arrays.toString(allGuessPatterns[turn].value);
    }

    public String getGuessFeedbackFromTurn(int turn){
        return allGuessFeedback[turn];
    }

    public String getCurrentDisplayTurn(){
        return turn.displayTurn();
    }

    public void increaseTurn(){
        turn.increase();
    }
}
