package JoelLiriano.Mastermind.views.console;

import JoelLiriano.Mastermind.controllers.StartController;
import JoelLiriano.Mastermind.utils.IO;
import JoelLiriano.Mastermind.utils.LimitedIntDialog;

public class StartView {

    void interact(StartController startController){
        new IO().writeln("MasterMind\n1. Partida\n2. Demo");
        int gameMode = new LimitedIntDialog("Opción?", 1, 2).read();
        startController.start(gameMode);
    }
}