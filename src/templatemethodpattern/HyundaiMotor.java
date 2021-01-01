package templatemethodpattern;

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door){
		super(door);
	}
	
	private void moveHyundaiMotor(Direction direction){
		System.out.println("move " + direction.toString());
	}

	@Override
	protected void moveMotor(Direction direction) {
		// TODO Auto-generated method stub
		moveHyundaiMotor(direction);
	}
}
