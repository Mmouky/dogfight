package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogFightModel extends Observable implements IDogFightModel {

	private Sky sky;
	private ArrayList<IMobile> mobiles;

	public DogFightModel() {
		this.mobiles = new ArrayList<IMobile>();
	}

	@Override
	public Iarea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMobile(IMobile mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(IMobile mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobileHavesMoved() {
		// TODO Auto-generated method stub

	}

}
