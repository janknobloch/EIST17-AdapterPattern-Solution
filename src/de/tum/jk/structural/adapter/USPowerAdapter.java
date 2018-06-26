package de.tum.jk.structural.adapter;

public class USPowerAdapter extends PowerAdapter {
	
	private USCharger adaptee;
	
	public USPowerAdapter() {
		this.adaptee = new USCharger();
	}

	@Override
	public void getPower() {
		adaptee.provide120Volt();
	}

}
