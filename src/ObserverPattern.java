import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Observer Pattern
 * 
 * Subject의 변경사항을 Observer에게 전달해주는 패턴
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
		System.out.println("클라이언트 1에 변경사항이 반영됨");
		
	}
		
}

class Client2 implements Subject.IObserver{

	@Override
	public void noti() {
		// TODO Auto-generated method stub
		System.out.println("클라이언트 2에 변경사항이 반영됨");
		
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
			System.out.println("메세지를 전송하였스빈다");
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
 * 클라이언트 등록을 위한 데몬 클래스
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