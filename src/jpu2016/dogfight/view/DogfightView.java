package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.model.IDogFightModel;

import java.util.Observable;

public class DogfightView extends Observable implements Runnable, IViewSystem {

	EventPerformer eventPerformer;
	GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;

	public DogfightView(IOrderPerformer iOrderPerformer, IDogFightModel iDogFightModel, Observable observable) {
		this.gameFrame = new GameFrame("DogFight", eventPerformer, graphicsBuilder, observable);
		this.eventPerformer = new EventPerformer(iOrderPerformer);
		this.graphicsBuilder = new GraphicsBuilder(iDogFightModel);
	}
	
	

	public void run() {

	}

	public String displayMessage(String message) {
		return "";
	}
	
	public void closeAll() {

	}

}
