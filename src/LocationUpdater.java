import java.util.Scanner;

public class LocationUpdater extends Location {
	String location = "";
	String next = "";
	boolean entered = true;
	boolean found = false;
	boolean exit = false;
	// Scanner s = new Scanner(System.in);
	Reader reader;

	LocationUpdater(Reader reader) {
		this.reader = reader;
		location = "";
	}

	public void updater() {
		System.out.println("\nThe Entrance\n" + "You arrive at the doors of Hogwarts. \n"
				+ "The door on the north wall leads to the dining hall,\nthe door to the east leads to the Potions class,\n"
				+ "and the door to the west leads to the Library.");
		// location = s.nextLine(); // Read user input
		location = reader.nextLine();
		location = location.toLowerCase();
		setLocation(location);
		while (!getLocation().contains("mischief managed") && !found && !exit) {
			if (getLocation().contains("north")) {
				next = "";
				Dining_Hall student = new Dining_Hall(reader);
				student.greeting();
				next = student.look();
				student.walk(next);
				// next_loc();
			} else if (getLocation().contains("east")) {
				next = "";
				Potions student_p = new Potions(reader);
				student_p.greeting();
				next = student_p.look();
				student_p.walk(next);
			} else if (getLocation().contains("west")) {
				next = "";
				Library student_l = new Library();
				student_l.greeting();
				student_l.look_l();
				found = true;
			} else if (useList(commands, getLocation())) {
				System.out.println("You cannot go there!");
			} else {
				System.out.println("That is not a valid command!");
			}
			next_loc(next);
		}
		exit = true;
	}

	public synchronized void next_loc(String next) {
		if (next.contains("mischief managed")) {
			setLocation(next);
		} 
		else if(found){}
		else{
			System.out.println("\nYou have arrived back at the Entrance"
					+ "\nThe door on the north wall leads to the dining hall, "
					+ "\nthe door to the east leads to the Potions class, \nand the door to the west leads to the Library.");
			location = reader.nextLine();
			setLocation(location);
		}
	}

	public synchronized String getLocation() {
		return location;
	}

	public synchronized void setLocation(String location) {
		this.location = location;
	}

}