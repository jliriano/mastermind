package JoelLiriano.Mastermind.views.console;

import JoelLiriano.Mastermind.controllers.ContinueController;
import JoelLiriano.Mastermind.utils.YesNoDialog;

class ContinueView {

    void interact(ContinueController continueController){
        continueController.resume(new YesNoDialog("Desea continuar")
                .read());
    }
}