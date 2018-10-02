package JoelLiriano.Mastermind.utils;


public class LimitedStringDialog {

    private String title;
    private String regex;

    public LimitedStringDialog(String validColors, String regex, String action, int requiredLength){
        assert validColors != null;
        assert action != null;
        assert regex != null;
        assert requiredLength != 0;
        this.regex = regex;
        this.title = validColors + ". " + action + ": ";
    }

    public String read(){
        IO io = new IO();
        String value;
        boolean ok;
        do {
            value = io.readString(title).toUpperCase();
            ok = value.matches(regex);
            if (!ok) {
                io.writeln("Entrada incorrecta, por favor intente otra vez.");
            }
        } while (!ok);
        return value;
    }
}
