package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

public class EventPerformer extends UserOrder implements IEventPerformer {

    public EventPerformer(IOrderPerformer iOrderPerformer) {

    }

    public void eventPerformer(KeyEvent keyEvent){

    }

    public UserOrder keyCodeToUseOrder(int KeyCode){
        return null;
    }

    @Override
    public void eventPerform(KeyEvent keyCode) {

    }
}
