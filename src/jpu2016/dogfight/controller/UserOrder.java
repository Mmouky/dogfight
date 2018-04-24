package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder{
	
	private int player;
	private Order order;
	
	public UserOrder(int player, Order order) {
		this.player = player;
		this.order = order;
	}

	public UserOrder() {
	}

	@Override
	public Order getOrder() {
		return Order.UP;
	}

	@Override
	public int getPlayer() {
		return 1;
	}
	
	

}
