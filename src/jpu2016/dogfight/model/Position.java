package jpu2016.dogfight.model;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	public Position(double x, double y, double maxX, double maxY) {
		// TODO Auto-generated constructor stub
	}

	public Position(Position position) {
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
