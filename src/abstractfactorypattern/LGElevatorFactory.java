package abstractfactorypattern;

import abstractfactorypattern.door.Door;
import abstractfactorypattern.door.LGDoor;
import abstractfactorypattern.motor.HyundaiMotor;
import abstractfactorypattern.motor.LGMotor;
import abstractfactorypattern.motor.Motor;

public class LGElevatorFactory extends ElevatorFactory {
	private static ElevatorFactory factory = null;
	private LGElevatorFactory(){}
	
	public static ElevatorFactory getInstance(){
		if(factory==null){
			factory = new LGElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Motor createMotor() {
		// TODO Auto-generated method stub
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new LGDoor();
	}

}
