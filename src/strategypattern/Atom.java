package strategypattern;

public class Atom extends Robot{

	public Atom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("I have punch and can attack with it.");
	}

	@Override
	public void move() {
		System.out.println("I can fly.");
	}
	
	
}
