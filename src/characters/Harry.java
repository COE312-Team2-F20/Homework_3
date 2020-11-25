package characters;

import commands.*;
import locations.*;
import runtime.Reader;
import state.*;

import java.util.ArrayList;
import java.util.Random; 
import subject.*;

public class Harry extends Character implements Runnable {
	String line = "";
	private ArrayList observers;
	Random rand = new Random(); 
	boolean hasMap;
	static Reader reader;
	Watch w;
	Wand wand = new Wand();
	ExpectoPatronum exp = new ExpectoPatronum(wand);
	Expelliarmus ex = new Expelliarmus(wand);
	Protego p = new Protego(wand);
	Stupefy s = new Stupefy(wand);
	Command[] cmds = {exp, ex, p, s};
	ControlPanel cp = new ControlPanel(cmds);
	private static 	Harry instance;
	private State state = new HarryState();
	public static synchronized Harry getInstance(){
		if(instance == null){
		instance = new Harry(lu, reader);
		}
		 return instance;
		}
	public Harry(LocationUpdater lu, Reader reader) {
		super("Harry", lu);
		this.reader = reader;
		Thread t = new Thread(this);
		t.start();

	}

	public void run() {
		if (lu.entered = true) {
			w = new Watch();
			while (w.warnings != 3 && !lu.exit) {
				if (lu.newRoom()) {
					String input = reader.nextLine();
					fight(input);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lu.setdefeat(true);
				}
				if (lu.getLocation().contains("west")) {
					try {
						
						// wait for Hermione to shout out
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Found Hermione!");
					end();
				}
			}
			end();
		}
	}

	public void end() {
		if (lu.exit && !lu.found) {
			hasMap = false;
			System.out.println("Hiding map contents...end.");
		} else {
			String s = reader.nextLine();
			while (!s.contains("mischief managed") && !w.timeIsUp()) {
				System.out.println("Try again!");
				if (reader.hasNext() && !w.timeIsUp())
					s = reader.nextLine();
			}
			if (s.contains("mischief managed")) {
				hasMap = false;
				System.out.println("Hiding map contents...end.");
			}
		}
		if (!hasMap) {
			System.exit(0);
		}
	}

	public boolean hasMap() {
		return hasMap;
	}
	public void fight(String input) {
		if(input.contains("Expecto Patronum"))
			cp.order(0);
		else if(input.contains("Expelliarmus"))
			cp.order(1);
		else if(input.contains("Protego"))
			cp.order(2);
		else if(input.contains("Stupefy"))
			cp.order(3);
	}
	//state functions
	public void previousState() {
		state.prev(this);
	}

	public void nextState() {
		state.next(this);
	}

	public void printStatus() {
		state.printStatus();
	}

	public void setState(State state) {
		this.state = state;
	}
	}
