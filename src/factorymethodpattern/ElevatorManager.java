package factorymethodpattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID){
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for(int i=0; i<controllerCount; i++){
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		this.strategyID = strategyID;
	}
	
	void reqeustElevator(int destination, Direction direction){
		ElevatorScheduler scheduler = SchedulerFactory.getShceduler(strategyID);
		System.out.println(scheduler);
		
		int selectedElevator = scheduler.selectElevator(this, destination, direction);		
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
