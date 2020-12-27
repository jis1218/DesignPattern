package statepattern;

public class Off implements IState {

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light On!");
		light.setState(new On());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("반응 없음");
		
	}
	

}
