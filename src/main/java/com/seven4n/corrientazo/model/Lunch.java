package com.seven4n.corrientazo.model;

public class Lunch {

	private String route;
	private boolean delivered;
	
		
	public Lunch(String route, boolean delivered) {
		this.route = route;
		this.delivered = delivered;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
}
