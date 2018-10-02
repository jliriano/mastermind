package JoelLiriano.Mastermind.controllers;

public interface StartController extends OperationController,
        PresenterController {

    void start(int gameMode);

}