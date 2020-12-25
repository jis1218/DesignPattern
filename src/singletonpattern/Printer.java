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
		 *���� ������ 1�� �����ڸ� ȣ���� �ν��Ͻ��� ����� �� 
		 *������ 2�� if���� ������ printer ������ null���� Ȯ���Ѵ�. 
		 *���� null�̹Ƿ� �ν��Ͻ��� �����ϴ� �ڵ�, 
		 *�� �����ڸ� ȣ���ϴ� �ڵ带 �����ϰ� �ȴ� 
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
