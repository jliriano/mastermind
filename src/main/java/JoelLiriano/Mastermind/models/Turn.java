package JoelLiriano.Mastermind.models;

public class Turn {

	private int value = 0;

	private static final int MAX_TURNS = 10;
	
	public Turn() {
		value = 0;
	}
	
    public void increase() {
        value++;
    }
    
    public int current() {
    	return value;
    }

    public boolean hasTurns(){
	    if(this.value<MAX_TURNS) {
	        return true;
        } else return false;
    }

    public String displayTurn(){
	    return ""+(value+1);
    }

    public int getMaxTurns(){
	    return MAX_TURNS;
    }
	
}
