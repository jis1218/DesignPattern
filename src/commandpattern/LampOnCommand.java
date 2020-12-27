package commandpattern;

public class LampOnCommand implements Command {
	private Lamp theLamp;
	
	public LampOnCommand(Lamp theLamp){
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theLamp.turnOn();
	}
	
	
}
