package characters;

import subject.*;

public class Bellatrix extends Villians implements Observer {
	private Subject subject;

	public Bellatrix(Subject subject) {
		super("Bellatrix");
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	public void fight() {
		System.out.println("Bellatrix Lestrange is here, get ready to fight");
	}

	@Override
	public void update(boolean flag) {
		if(flag)
		System.out.println("You have saved yourself");
		
	}
}
