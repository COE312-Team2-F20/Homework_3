import java.util.Arrays;

public abstract class Location {
	public String[] commands = new String[4];
	public String room;

	Location() {
		room = "room";
		commands = new String[] { "leave", "exit", "walk", "get out" };
	}

	Location(String room) {
		this.room = room;
		commands = new String[] { "leave", "exit", "walk", "get out" };
	}

	public synchronized String look() {
		System.out.println("You look around the " + room);
		return room;
	}

	public void walk(String input) {
		if (!input.contains("mischief managed")) {
			if (useList(commands, input))
				System.out.println("You leave the " + room + "...");
		}
	}

	public void greeting() {
		System.out.println("You enter the " + room);
	}

	public static boolean useList(String[] arr, String targetValue) {
		String[] temp = targetValue.split(" ");
		return Arrays.asList(arr).contains(temp[0]);
	}
}