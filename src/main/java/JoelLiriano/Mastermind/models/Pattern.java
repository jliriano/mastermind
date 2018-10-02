package JoelLiriano.Mastermind.models;

import java.util.Random;

public class Pattern {

    protected static final int MAX_ITEMS = Color.getMaxInputColors();
    protected char[] value = new char[MAX_ITEMS];

    public char[] getValue() {
        return value;
    }

    public int getMaxItems(){
        return MAX_ITEMS;
    }

    public void generateRandomValue() {
        char[] value = new char[getMaxItems()];
        int randomIndex;
        for(int i = 0; i< getMaxItems(); i++){
            randomIndex = new Random().nextInt(Color.getSize());
            value[i] = Color.getValueAt(randomIndex);
        }
        this.value = value;
    }

    public String getValueString() {
        assert value != null;
        String string = "";
        for(int i = 0; i< value.length; i++){
            string = string+ value[i];
        }
        return string;
    }
}
