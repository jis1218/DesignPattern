package abstractfactorypattern.motor;

import abstractfactorypattern.Direction;

public class HyundaiMotor extends Motor {
	
	private void moveHyundaiMotor(Direction direction){
		System.out.println("move " + direction.toString());
	}

	@Override
	protected void moveMotor(Direction direction) {
		// TODO Auto-generated method stub
		moveHyundaiMotor(direction);
	}
}
