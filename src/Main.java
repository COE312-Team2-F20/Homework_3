
public class Main {
	protected static Watch obj;

	public static void main(String args[]) {
		Reader reader = new Reader();
		LocationUpdater lu = new LocationUpdater(reader);
		new Console(lu, reader);
		new Harry(lu, reader);
		new Hermione(lu);
	}
}
