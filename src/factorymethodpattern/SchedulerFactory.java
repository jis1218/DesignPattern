package factorymethodpattern;

import java.util.Calendar;

enum SchedulingStrategyID{RESPONSE_TIME, THROUGHPUT, DYNAMIC}

public class SchedulerFactory {
	public static ElevatorScheduler getShceduler(SchedulingStrategyID strategyID){
		ElevatorScheduler scheduler = null;
		switch(strategyID){
		case RESPONSE_TIME:
			scheduler = ResponseTimeScheduler.getInstance();
			break;
		case THROUGHPUT:
			scheduler = ThroughputScheduler.getInstance();
		case DYNAMIC:
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if(hour<12)
				scheduler = ResponseTimeScheduler.getInstance();
			else
				scheduler = ThroughputScheduler.getInstance();
			break;
		}
		return scheduler;
	}
}
