package state;

import characters.*;

public interface State {
	public void prev(Harry harry);
	public void next(Harry harry);
	public void printStatus();

}
