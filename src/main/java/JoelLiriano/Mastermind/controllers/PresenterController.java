package JoelLiriano.Mastermind.controllers;


import JoelLiriano.Mastermind.models.Board;

public interface PresenterController {

    Board getBoard();

    void accept(OperationControllerVisitor operationControllerVisitor);
}
