package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogFightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private static int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogFightModel dogfightModel;

	public DogfightController(IDogFightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	@Override
	public void orderPerform(UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}

	private void launchMissile(int player) {
		
	}

	private void gameLoop() {

	}

}
