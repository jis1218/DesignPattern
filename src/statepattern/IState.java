package statepattern;

public interface IState {
	public void on_button_pushed(Light light);
	public void off_button_pushed(Light light);

}
