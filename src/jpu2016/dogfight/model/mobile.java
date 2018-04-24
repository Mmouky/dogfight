package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class mobile implements IMobile {

	private int speed;
	private Position position;
	private Dimension dimension;
	private Direction direction;
	private Image images[] = new Image[4];

	public mobile(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		this.direction = direction;
		this.position=position;
		this.dimension = dimension;
		this.speed=speed;
		
	}

	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub

	}

	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getImage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void move() {
		// TODO Auto-generated method stub

	}

	public void placeInArea(Iarea area) {
		// TODO Auto-generated method stub

	}

	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	public DogFightModel setDogFightModel(DogFightModel dogfightmodel) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

}
