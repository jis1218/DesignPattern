package decoratorpattern;

public class Client {
	public static void main(String[] args){
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay()); //������ ���� null �ϸ� super.draw()�� �۵� ����
		roadWithLane.draw();
		
		
	}

}
