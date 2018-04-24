package jpu2016.dogfight.model;

public class Plane extends mobile {
	static private int SPEED = 2;
	static private int WIDTH = 100;
	static private int HEIGHT = 30;
	static private int PLAYER;

	public Plane(int PLAYER, Direction direction, String Image, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, Image);
	}

	public boolean isPlayer() {
		return false;

	}

	public boolean hit() {
		return false;
	}
}
