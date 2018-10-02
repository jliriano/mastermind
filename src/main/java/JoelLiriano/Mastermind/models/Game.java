package JoelLiriano.Mastermind.models;

import java.util.Arrays;

public class Game {

	private State state;
	
	private Turn turn;

	private Board board;

	private GuessPattern guessPattern;

	private SecretPattern secretPattern;
	
	private static final int NUM_PLAYERS = 1;

	private int gameType;

	public Game() {
		state = State.INITIAL;
		turn = new Turn();
		secretPattern = new SecretPattern();
		board = new Board(secretPattern);
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state){
		this.state = state;
	}

	public Board getBoard(){
	    return board;
    }

    public String getSecretString() {
	    return secretPattern.getValueString();
    }

    public char[] getSecret(){
	    return secretPattern.value;
    }

	public void setSecretPattern() {
	    secretPattern.generateRandomValue();
    }

	public GuessPattern getGuessPattern(){
	    return guessPattern;
    }

    public int getNumPlayers(){
	    return NUM_PLAYERS;
    }

    public void changeTurn(){
	    turn.increase();
    }

    public int getCurrentTurn(){
	    return turn.current();
    }

    public boolean existMatch(){
	    board.setGuessPattern(guessPattern);
	    return board.matchSecret(secretPattern.value);
    }

    public void setGameType(int option){
	    assert option!=0;
	    gameType = option;
    }

    public String getGameType(){
	    assert gameType!=0;
	    if(gameType==1){
	        return "GAME";
        } else if (gameType==2){
	        return "DEMO";
        } return "NONE";
    }

    public void clear() {
        turn = new Turn();
        secretPattern = new SecretPattern();
        guessPattern = new GuessPattern();
        state = State.INITIAL;
    }

    public boolean turnsComplete(){
        return (turn.current()<turn.getMaxTurns())? false : true;
    }
}
