package JoelLiriano.Mastermind.models;

import JoelLiriano.Mastermind.utils.LimitedStringDialog;

public class GuessPattern extends Pattern {

    //THIS SHOULD BE HANDLED BY THE VIEW (GETTING THE INPUT) AND THE MODEL SHOULD JUST SAVE IT.
    public void requestManualValue() {
        char[] manualguess = new char[MAX_ITEMS];
        new LimitedStringDialog(Color.getValidInput(), Color.getAllowedColorsRegEx(), "Intento?",MAX_ITEMS).read().toCharArray();
        setManualValue(manualguess);
    }

    public void setManualValue(char[] value){
        assert value != null;
        this.value = value;
    }
}
