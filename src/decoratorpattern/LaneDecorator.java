package decoratorpattern;

public class LaneDecorator extends DisplayDecorator {
	public LaneDecorator(Display decoratedDisplay){
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawLane();
	}
	
	private void drawLane(){
		System.out.println("\t���� ǥ��");
	}
	
	
}
