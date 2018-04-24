package jpu2016.dogfight.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

    int getGlobalWidth();
    int getGlobalHeight();

    void applyModelToGraphic(Graphics graphics, ImageObserver observer);

}
