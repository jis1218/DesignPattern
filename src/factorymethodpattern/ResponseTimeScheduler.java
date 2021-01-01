package factorymethodpattern;

public class ResponseTimeScheduler implements ElevatorScheduler {
	
	private ResponseTimeScheduler(){};
	private static ResponseTimeScheduler scheduler = null;
	
	public static ResponseTimeScheduler getInstance(){
		if(scheduler==null){
			scheduler = new ResponseTimeScheduler();
		}
		return scheduler;
	}
	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
