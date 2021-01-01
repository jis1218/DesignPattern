package templatemethodpattern;

public class Client {
	public static void main(String args[]){
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		hyundaiMotor.moveMotor(Direction.UP);
	}

}
