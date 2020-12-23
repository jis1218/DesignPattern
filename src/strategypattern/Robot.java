package strategypattern;

import strategypattern.strategy.IAttackStrategy;
import strategypattern.strategy.IMovingStrategy;

public abstract class Robot{
	private String name;
	private IMovingStrategy movingStrategy;
	private IAttackStrategy attackStrategy;
	
	public Robot(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void move(){
		movingStrategy.move();
	}
	
	public void attack(){
		attackStrategy.attack();
	}

	public void setMovingStrategy(IMovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void setAttackStrategy(IAttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
	



}
