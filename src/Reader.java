import java.util.Scanner;

public class Reader {
	Scanner input;

//All threads share the same input stream
	Reader() {
		input = new Scanner(System.in);
	}

	String nextLine() {
		return input.nextLine();
	}

	boolean hasNext() {
		return input.hasNext();
	}
}
