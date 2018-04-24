package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements Iarea {

	private Image image;
	private Dimension dimension;

	public Sky(Dimension dimension) {
		this.dimension = dimension;
	}

	public Dimension getDimenson() {
		// TODO Auto-generated method stub
		return new Dimension(1,1);
	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
