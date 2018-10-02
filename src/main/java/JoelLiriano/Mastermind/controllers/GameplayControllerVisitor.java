package JoelLiriano.Mastermind.controllers;

public interface GameplayControllerVisitor {

    void visit(PatternController patternController);
    void visit (OperationController operationController);
}
