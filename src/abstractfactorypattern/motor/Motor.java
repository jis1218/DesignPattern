package abstractfactorypattern.motor;

import abstractfactorypattern.Direction;
import abstractfactorypattern.door.Door;
import abstractfactorypattern.door.DoorStatus;

public abstract class Motor {
	protected Door door;
	private MotorStatus motorStatus;
	
	public Motor(){};
	
	public Motor(Door door){
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	public MotorStatus getMotorStatus(){
		return motorStatus;
	}
	
	protected void setMotorStatus(MotorStatus motorStatus){
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction){
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING) return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPEN) door.close();
		
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
	
	protected abstract void moveMotor(Direction direction);
	
	public void setDoor(Door door){
		this.door = door;
	}

}
