
public class Hermione extends Character implements Runnable {
	Hermione(LocationUpdater lu) {
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
