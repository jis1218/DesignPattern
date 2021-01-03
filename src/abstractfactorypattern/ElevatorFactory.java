package abstractfactorypattern;

import abstractfactorypattern.door.Door;
import abstractfactorypattern.motor.Motor;

public abstract class ElevatorFactory {
	public abstract Motor createMotor();
	public abstract Door createDoor();

}
