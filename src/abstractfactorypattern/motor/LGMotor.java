package abstractfactorypattern.motor;

import abstractfactorypattern.Direction;

public class LGMotor extends Motor {
	
	private void moveLGMotor(Direction direction){
		System.out.println("move " + direction.toString());
	}

	@Override
	protected void moveMotor(Direction direction) {
		// TODO Auto-generated method stub
		moveLGMotor(direction);
	}
}
