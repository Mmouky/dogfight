package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}

	public void update(Observable observable, Object arg) {
		
	}

	public void paintCoponent(Graphics graphics) {

	}

}
