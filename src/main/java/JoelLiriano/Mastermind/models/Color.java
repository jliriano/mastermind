package JoelLiriano.Mastermind.models;

import java.util.Random;

public enum Color {
    AMARILLO('A'),
    ROJO('R'),
    VERDE('V'),
    AZUL('Z'),
    BLANCO('B'),
    NEGRO('N');

    private char value;
    private final static int MAX_INPUT_COLORS = 4;
    private static String validInput;
    private static int size = values().length;

    private Color(char value) {
        this.value = value;
    }

    public static String getValidInput(){
        if(validInput==null){
            validInput = generateValidInputString();
        }
        return validInput;
    }

    public static int getMaxInputColors(){
        return MAX_INPUT_COLORS;
    }

    public static boolean contains(char color){
        for(int i=0; i<size; i++){
            if(values()[i].value==color){
                return true;
            }
        }
        return false;
    }

    public static int getSize(){
        return size;
    }

    public static String getAllowedColorsRegEx(){
        String regex = "["+getAllowedColors().toString()+"]{"+ MAX_INPUT_COLORS +"}";
        return regex;

    }

    private static String generateValidInputString(){
        String validInput = MAX_INPUT_COLORS+" letras de entre ";
        for(int i=0; i<size; i++){
            validInput = validInput+values()[i].value+"-"+values()[i].toString().toLowerCase();
            if(i<=MAX_INPUT_COLORS){
                validInput = validInput+", ";
            }
        }
        return validInput;
    }

    public static String getAllowedColors(){
        String allowedColors = "";
        for(int i=0; i<size; i++){
            allowedColors = allowedColors+values()[i].value;
        }
        return allowedColors;
    }

    public static char getValueAt(int index){
        return values()[index].value;
    }
}
