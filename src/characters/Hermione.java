package characters;

import locations.LocationUpdater;

public class Hermione extends Character implements Runnable {
	public Hermione(LocationUpdater lu) {
		super("Hermione", lu);
		Thread t = new Thread(this);
		t.start();
		this.lu = lu;
	}

	public void run() {
		while (!lu.getLocation().contains("west"));
		{}
		System.out.println("Harry I am here");
	}
}
