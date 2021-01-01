package templatemethodpattern;

public class LGMotor extends Motor {
	
	public LGMotor(Door door){
		super(door);
	}
	
	private void moveLGMotor(Direction direction){
		System.out.println("move " + direction.toString());
	}

	@Override
	protected void moveMotor(Direction direction) {
		// TODO Auto-generated method stub
		moveLGMotor(direction);
	}
}
