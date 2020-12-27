package statepattern;

public class Light {
	private IState state;
	
	public Light(){
		state = new Off();
	}
	
	public void setState(IState state){
		this.state = state;
	}
	
	public void on_button_pushed(){
		state.on_button_pushed(this);
	}
	
	public void off_button_pushed(){
		state.off_button_pushed(this);
	}

}
