package singletonpattern;

public class User extends Thread {
	public User(String name){
		super(name);
	}
	
	@Override
	public void run() {
		Printer printer = Printer.getInstance();
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString());
	}
}
