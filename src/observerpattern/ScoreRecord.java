package observerpattern;
import java.util.*;

public class ScoreRecord extends Subject {
	private List<Integer> scores = new ArrayList<Integer>();
	
	public void addScore(int score){
		scores.add(score);
		//dataSheetView.update();
		notifyObservers();
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}

}
