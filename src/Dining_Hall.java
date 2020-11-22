public class Dining_Hall extends Location {
	String next;
	Reader reader;

	Dining_Hall(Reader reader) {
		super("Dining Hall");
		this.reader = reader;

	}

	public synchronized String look() {
		//Shows what is inside the room
		System.out.println("The dining hall is the biggest open area inside Hogwarts. Bellatrix Lestrange is here, get ready to fight!");
		//waits for user's next command
		next = reader.nextLine();
		next = next.toLowerCase();
		//if harry needs to hide the map while he's in this room return the phrase mischief managed
		if (next.contains("mischief managed"))
			return next;
		//if the user types a command that isn't inside the list of acceptable commands the program will ask the user to type it again
		while (!useList(commands, next)) {
			System.out.println("That is not a valid command!");

			next = reader.nextLine();
			next = next.toLowerCase();
		}
		return next;
	}
}