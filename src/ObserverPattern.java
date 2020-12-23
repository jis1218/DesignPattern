import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Observer Pattern
 * 
 * Subject�� ��������� Observer���� �������ִ� ����
 */

public class ObserverPattern {
	public static void main(String args[]){
		Subject server = new Subject();
		server.start();
		
		new ClientDaemon(server).start();
	}

}

class Client1 implements Subject.IObserver{

	@Override
	public void noti() {
		// TODO Auto-generated method stub
		System.out.println("Ŭ���̾�Ʈ 1�� ��������� �ݿ���");
		
	}
		
}

class Client2 implements Subject.IObserver{

	@Override
	public void noti() {
		// TODO Auto-generated method stub
		System.out.println("Ŭ���̾�Ʈ 2�� ��������� �ݿ���");
		
	}
		
}

class Subject extends Thread{
	
	List<IObserver> clients = new ArrayList<>();
	public void run(){
		
		Random random = new Random();
		
		while(true){
			for(IObserver observer : clients){
				observer.noti();
			}
			System.out.println("�޼����� �����Ͽ������");
			try {
				Thread.sleep(random.nextInt(9000)+1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public interface IObserver{
		public void noti();
	}
}

/*
 * Ŭ���̾�Ʈ ����� ���� ���� Ŭ����
 */
class ClientDaemon extends Thread{
	Subject server;
	public ClientDaemon(Subject server){
		this.server = server;
	}
	
	public void run(){
		int count = 0;
		if(count%2 ==0){
		server.clients.add(new Client1());
		}else{
			server.clients.add(new Client2());
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}