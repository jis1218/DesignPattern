package abstractfactorypattern;

import abstractfactorypattern.door.Door;
import abstractfactorypattern.door.DoorFactory;
import abstractfactorypattern.motor.Motor;
import abstractfactorypattern.motor.MotorFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElevatorFactory factory = ElevatorFactoryFactory.getFactory(VendorID.HYUNDAI);
		
		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);
		door.open();
		motor.move(Direction.UP);
	}

}
