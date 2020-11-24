package commands;

import java.util.Arrays;

public class ControlPanel {
	Command [] slots;
	
	public ControlPanel(Command slots []){
		this.slots = slots;
	}
  
	public void order(int i){
		slots[i].execute();
	}
}
