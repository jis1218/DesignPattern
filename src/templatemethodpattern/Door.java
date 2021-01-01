package templatemethodpattern;

public class Door {
	
	private DoorStatus doorStatus;
	
	public Door(){
		doorStatus = DoorStatus.CLOSED;
	}
	
	public DoorStatus getDoorStatus(){
		return doorStatus;
	}
	
	public void close(){
		doorStatus = DoorStatus.CLOSED;
	}
	
	public void open(){
		doorStatus = DoorStatus.OPENED;
	}

}

enum DoorStatus {CLOSED, OPENED}
enum MotorStatus {MOVING, STOPPED}
enum Direction {UP, DOWN}

