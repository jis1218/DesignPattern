package singletonpattern;

public class Printer {
	private static Printer printer = null;
	private int counter = 0;
	
	public synchronized static Printer getInstance(){
		if(printer==null){
			try{
				Thread.sleep(1); 
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			printer = new Printer();
		}
		/*
		 *만약 스레드 1이 생성자를 호출해 인스턴스를 만들기 전 
		 *스레드 2가 if문을 실행해 printer 변수가 null인지 확인한다. 
		 *현재 null이므로 인스턴스를 생성하는 코드, 
		 *즉 생성자를 호출하는 코드를 실행하게 된다 
		 */

		return printer;
	}
	
	public void print(String str){
		synchronized(this){
			counter++;
			System.out.println(str + ", count = " + counter);
		}
	}

}
