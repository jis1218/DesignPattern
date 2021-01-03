package abstractfactorypattern;

import abstractfactorypattern.door.Door;
import abstractfactorypattern.door.HyundaiDoor;
import abstractfactorypattern.motor.HyundaiMotor;
import abstractfactorypattern.motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {

	private static ElevatorFactory factory = null;
	private HyundaiElevatorFactory(){}
	
	public static ElevatorFactory getInstance(){
		if(factory==null){
			factory = new HyundaiElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new HyundaiDoor();
	}

}
