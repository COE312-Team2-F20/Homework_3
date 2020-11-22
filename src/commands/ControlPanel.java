package commands;


public class ControlPanel {
	Command [] slots;
	
	ControlPanel(Command slots []){
		this.slots = slots;
	}
  
	public void order(int i){
		slots[i].execute();
	}	
}
