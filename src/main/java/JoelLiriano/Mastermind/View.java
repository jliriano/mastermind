package JoelLiriano.Mastermind;

import JoelLiriano.Mastermind.controllers.OperationController;
import JoelLiriano.Mastermind.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

    public void interact(OperationController operationController);
}