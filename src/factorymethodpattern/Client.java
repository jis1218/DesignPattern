package factorymethodpattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
		emWithResponseTimeScheduler.reqeustElevator(10, Direction.UP);
	}

}
