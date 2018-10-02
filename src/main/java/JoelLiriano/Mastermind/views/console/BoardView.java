package JoelLiriano.Mastermind.views.console;

import JoelLiriano.Mastermind.controllers.PresenterController;
import JoelLiriano.Mastermind.utils.IO;

class BoardView {

    private PresenterController controller;

    BoardView(PresenterController controller) {
        assert controller != null;
        this.controller = controller;
    }

    void write() {
        IO io = new IO();
    }
}