package jpu2016.dogfight.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

	public int getGlobalWidth();

	public int getGlobalHeight();

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);

}
