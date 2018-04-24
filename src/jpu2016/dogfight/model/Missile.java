package jpu2016.dogfight.model;

public class Missile extends mobile {
	static private int SPEED = 4;
	static private int WIDTH = 30;
	static private int HEIGHT = 10;
	static private int MAX_DISTANCE_TRAVELED = 1400;
	static private String image = "MISSILE";

	public Missile(Direction direction, Dimension dimension) {
		
	}
	
	private int getWidthWithaDirection(Direction direction){
		return 1;
	}

	private int getHeightWithaDirection(Direction direction){
		return 1;
	}
	
	public void move(){
		
	}
	public boolean isWeapon(){
		return false;
		
	}
}

