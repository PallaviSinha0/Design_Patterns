package memento_pattern;

import java.util.List;
import java.util.ArrayList;

public class PlayerStatusCaretaker {

	public static void main(String[] args) {
		
		System.out.println("Game Started");
	
		
		List<CurrentPlayerStatus.PlayerStatusMemento> updatedStatus= new ArrayList<CurrentPlayerStatus.PlayerStatusMemento>();
		CurrentPlayerStatus currentPlayerStatus = new CurrentPlayerStatus();
		currentPlayerStatus.setPlayerPoints(1200L);
		currentPlayerStatus.setPlayerLevel(2);
		updatedStatus.add(currentPlayerStatus.createMementoFromStatus());
		System.out.println("Player reached 2nd level with 1200 points");
		printCurrentPlayerStatus(currentPlayerStatus);
		System.out.println("Player stores current status as memento");
		currentPlayerStatus.setPlayerPoints(2200L);
		currentPlayerStatus.setPlayerLevel(4);
		updatedStatus.add(currentPlayerStatus.createMementoFromStatus());
		System.out.println("Player reached 4th level with 2200 points");
		printCurrentPlayerStatus(currentPlayerStatus);
		System.out.println("Player stores current status as memento");
		currentPlayerStatus.setPlayerPoints(3300L);
		currentPlayerStatus.setPlayerLevel(6);
		updatedStatus.add(currentPlayerStatus.createMementoFromStatus());
		System.out.println("Player reached 6th level with 3300 points");
		printCurrentPlayerStatus(currentPlayerStatus);
		System.out.println("Player stores current status as memento");
		System.out.println("At this point player loses & is relegated to status saved in memento");
		currentPlayerStatus.setStatusFromMemento(updatedStatus.get(0));
		printCurrentPlayerStatus(currentPlayerStatus);
		
		
	}

	public static void printCurrentPlayerStatus(CurrentPlayerStatus currentPlayerStatus) {
		System.out.println("Player points->" + currentPlayerStatus.getPlayerPoints() + ",level->"
				+ currentPlayerStatus.getPlayerLevel());
	}
}
