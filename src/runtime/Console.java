package runtime;
import locations.*;
public class Console implements Runnable {
	Reader reader;
	LocationUpdater user;

	Console(LocationUpdater user, Reader reader) {
		this.user = user;
		this.reader = reader;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		//Printing the welcome message for the map
		System.out.println("Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\n"
				+ "magical Mischief-Makers are proud to present THE MARAUDER'S MAP\n"
				+ "\nSay the magic phrase to reveal the map.\n"); 
		// Read user input
		String magicPhrase = reader.nextLine();
		magicPhrase = magicPhrase.toLowerCase();
		//if the magic phrase was not entered the map will remain blank and ask for the magic phrase again
		while (!magicPhrase.contains("i solemnly swear that i am up to no good")) {
			System.out.println("The map remains blank...");
			System.out.println("Say the magic phrase to reveal the map.\n");
			magicPhrase = reader.nextLine();
			magicPhrase = magicPhrase.toLowerCase();
		}
		//once the user enters the correct magic phrase the flag will update to show that harry has entered the castle
		user.entered = true;
		synchronized (user) {
			try {
			user.updater();
			} catch (Exception e) {
				System.out.println("Exception thrown");
			}
		}
	}
}
