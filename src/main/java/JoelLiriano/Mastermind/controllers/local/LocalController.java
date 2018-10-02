package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.models.Board;
import JoelLiriano.Mastermind.models.Game;
import JoelLiriano.Mastermind.models.GuessPattern;
import JoelLiriano.Mastermind.models.State;

public abstract class LocalController {

    private Game game;

    protected LocalController(Game game) {
        assert game != null;
        this.game = game;
    }

    protected int numPlayers() {
        return game.getNumPlayers();
    }

    protected State getState() {
        return game.getState();
    }

    protected String getGameType() {
        return game.getGameType();
    }

    public void setState(State state) {
        assert state != null;
        game.setState(state);
    }

    public int getCurrentTurn() {
        return game.getCurrentTurn();
    }

    public void guess() {
        //game.guess();
        if (game.existMatch()) {
            game.setState(State.FINAL);
        } else {
            game.changeTurn();
        }
    }

    public void clear() {
        game.clear();
    }

    public boolean existMatch() {
        return game.existMatch();
    }

    public void setGameType(int mode) {
        game.setGameType(mode);
    }

    public void setSecretPattern() {
        game.setSecretPattern();
    }

    public String getSecretString() {
        return game.getSecretString();
    }

    public void nextTurn() {
        game.changeTurn();
    }

    public boolean turnsComplete() {
        return game.turnsComplete();
    }

    public Board getBoard(){
        return game.getBoard();
    }

    public void addGuessToBoard(GuessPattern guessPattern){
        game.getBoard().setGuessPattern(guessPattern);
    }

    public char[] getSecret(){
        return game.getSecret();
    }
}
