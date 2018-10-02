package JoelLiriano.Mastermind.controllers;

public interface OperationControllerVisitor {

        void visit(StartController startController);

        void visit(GameplayController gameplayController);

        void visit(ContinueController continueController);
}
