package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.model.IDogFightModel;

import java.util.Observable;

public class DogfightView extends Observable implements Runnable {

    EventPerformer eventPerformer = new EventPerformer(iOrderPerformer);
    GraphicsBuilder graphicsBuilder = new GraphicsBuilder(iDogFightModel);
    GameFrame gameFrame = new GameFrame("DogFight", eventPerformer, graphicsBuilder, observable);

    public String displayMessage(String message) {
        return null;
    }


    public DogfightView(IOrderPerformer iOrderPerformer, IDogFightModel iDogFightModel, Observable observable){

    }

    public void run() {

    }

    public void closeAll(){

    }

}
