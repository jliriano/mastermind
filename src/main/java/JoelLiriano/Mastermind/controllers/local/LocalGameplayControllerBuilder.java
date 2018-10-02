package JoelLiriano.Mastermind.controllers.local;

import JoelLiriano.Mastermind.models.Game;

public class LocalGameplayControllerBuilder {

    private Game game;
    private LocalOperationController localOperationController;

    LocalGameplayControllerBuilder (Game game){
        this.game = game;
    }

    public void build(int gameMode){
        if(gameMode == 1){
            localOperationController = new LocalGameplayController (game,new LocalManualCodebreakerController(game));
        }else{
            localOperationController = new LocalGameplayController(game,new LocalRandomCodebreakerController(game));
        }

    }

    LocalOperationController getOperationController (){
        return localOperationController;
    }

}
