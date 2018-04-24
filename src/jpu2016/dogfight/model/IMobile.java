package jpu2016.dogfight.model;

import java.awt.Point;

public interface IMobile {

	public Direction getDirection();

	public void setDirection(Direction direction);

	public Point getPosition();

	public Dimension getDimension();

	public int getHeight();

	public int getWidth();

	public int getSpeed();

	public int getImage();

	public void move();

	public void placeInArea(Iarea area);

	public boolean isPlayer(int player);

	public DogFightModel setDogFightModel(DogFightModel dogfightmodel);

	public boolean hit();

	public boolean isWeapon();
}
