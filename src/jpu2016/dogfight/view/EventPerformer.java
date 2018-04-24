package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

public class EventPerformer implements IEventPerformer {

	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer iOrderPerformer) {
		this.orderPerformer = iOrderPerformer;
	}

	public void eventPerform(KeyEvent keyCode) {
		
	}

	private UserOrder keyCodeToUseOrder(int keyCode) {
		return new UserOrder();
	}

}
