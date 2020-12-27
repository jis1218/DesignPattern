package statepattern;

public class On implements IState {

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("���� ����");
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off!");
		light.setState(new Off());
	}

}
