package memento_pattern;

public class PlayerStatus {
	private long playerPoints;
	private int playerLevel;

	public void setPlayerPoints(long playerPoints) {
		this.playerPoints = playerPoints;
	}

	public long getPlayerPoints() {
		return playerPoints;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

}
