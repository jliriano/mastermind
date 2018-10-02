package JoelLiriano.Mastermind.controllers;

public interface PatternControllerVisitor {

    void visit(ManualPatternController manualPatternController);

    void visit(RandomPatternController randomPatternController);
}
