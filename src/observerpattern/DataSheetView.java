package observerpattern;
import java.util.*;

public class DataSheetView implements IObserver {
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount){
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScores(record, viewCount);		
	}

	private void displayScores(List<Integer> record, int viewCount){
		System.out.println("List of " + viewCount + " entries: ");
		for(int i=0; i<viewCount && i < record.size(); i++){
			System.out.println(record.get(i));
		}
		System.out.println();
	}
	
	
}
