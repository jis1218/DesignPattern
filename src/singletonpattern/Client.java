package singletonpattern;

public class Client {
	private static final int Thread_NUM = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] user = new User[Thread_NUM];
		for(int i = 0; i<Thread_NUM; i++){
			user[i] = new User((i+1) + "-user");
			user[i].start();
		}
	}

}
