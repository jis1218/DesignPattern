package decoratorpattern;

public class Client {
	public static void main(String[] args){
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay()); //생성자 안을 null 하면 super.draw()가 작동 안함
		roadWithLane.draw();
		
		
	}

}
