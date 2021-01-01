package factorymethodpattern;

public class ThroughputScheduler implements ElevatorScheduler{
	
	private ThroughputScheduler(){};
	private static ThroughputScheduler scheduler = null;
	
	public static ThroughputScheduler getInstance(){
		if(scheduler==null){
			scheduler = new ThroughputScheduler();
		}
		return scheduler;
	}
	
	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		// TODO Auto-generated method stub
		return 0;
	}
}
