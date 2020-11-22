public class Harry extends Character implements Runnable {
	String line = "";
	boolean hasMap;
	Reader reader;
	LocationUpdater updater;
	Watch w;

	Harry(LocationUpdater lu, Reader reader) {
		super("Harry", lu);
		this.reader = reader;
		Thread t = new Thread(this);
		t.start();

	}

	public void run() {
		if (lu.entered = true) {
			w = new Watch();
			while (w.warnings != 3 && !lu.exit) {
				if (lu.getLocation().contains("west")) {
					try {
						// wait for Hermione to shout out
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Found Hermione!");
					end();
				}
			}
			end();
		}

	}

	public void end() {
		if (lu.exit && !lu.found) {
			hasMap = false;
			System.out.println("Hiding map contents...end.");
		} else {
			String s = reader.nextLine();
			while (!s.contains("mischief managed") && !w.timeIsUp()) {
				System.out.println("Try again!");
				if (reader.hasNext() && !w.timeIsUp())
					s = reader.nextLine();
			}
			if (s.contains("mischief managed")) {
				hasMap = false;
				System.out.println("Hiding map contents...end.");
			}
		}
		if (!hasMap) {
			System.exit(0);
		}
	}

	public boolean hasMap() {
		return hasMap;
	}

}