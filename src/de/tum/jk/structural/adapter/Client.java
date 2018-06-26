package de.tum.jk.structural.adapter;

public class Client {

	public static void main(String[] args) {
		PowerAdapter powerAdapter = new USPowerAdapter();
		connectAdapterToWall(powerAdapter);
	}
	
	private static void connectAdapterToWall(PowerAdapter powerAdapter) {
		powerAdapter.getPower();
	}


}
