package strategypattern;

import strategypattern.strategy.MissileStrategy;
import strategypattern.strategy.WalkingStrategy;

public class Client {
	public static void main(String[] args){
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("atom");
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());

		taekwonV.attack();
		taekwonV.move();
		
		atom.setMovingStrategy(new WalkingStrategy());
		atom.setAttackStrategy(new MissileStrategy());

		atom.attack();
		atom.move();
	}

}
