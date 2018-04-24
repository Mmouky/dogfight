package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Point;

public class mobile implements IMobile {

	private int speed;

	public mobile(Direction direction, Position position, Dimension dimension, int speed, String Image) {

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

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getISpeed() {
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

	public void placeInArena(Iarea area) {
		// TODO Auto-generated method stub

	}

	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	public DogFightModel setDogFightModel(DogFightModel dogfightmodel) {
		return dogfightmodel;
		// TODO Auto-generated method stub

	}

	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	private void moveUp() {

	}

	private void moveDown() {

	}

	private void moveRight() {

	}

	private void moveLeft() {

	}

	public Color getColor() {
		return null;

	}

	public IDogFightModel getDogFightModel() {
		return null;

	}

}
