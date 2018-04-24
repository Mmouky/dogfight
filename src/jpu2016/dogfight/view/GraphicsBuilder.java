package jpu2016.dogfight.view;

import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogFightModel;
import jpu2016.dogfight.model.IMobile;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class GraphicsBuilder implements IGraphicsBuilder {

	private IDogFightModel iDogFightModel;
	private BufferedImage emptySky;

	public GraphicsBuilder(IDogFightModel iDogFightModel) {
		this.iDogFightModel = iDogFightModel;
	}

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky(BufferedImage emptySky) {

	}

	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	public int getGlobalWidth() {
		return 1;
	}

	public int getGlobalHeight() {
		return 1;
	}

}
