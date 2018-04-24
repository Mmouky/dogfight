package jpu2016.dogfight.model;

import java.awt.Point;

public interface IMobile {

	public Direction getDirection();

	public void setDirection(Direction direction);

	public Point getPosition();

	public Dimension getDimension();

	public int getHeight();

	public int getWidth();

	public int getISpeed();

	public int getImage();

	public void move();

	public void placeInArena(Iarea area);

	public boolean isPlayer(int player);

	public DogFightModel setDogFightModel(DogFightModel dogfightmodel);

	public boolean hit();

	public boolean isWeapon();
}
