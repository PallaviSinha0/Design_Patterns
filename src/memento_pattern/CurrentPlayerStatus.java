package memento_pattern;

public class CurrentPlayerStatus {
	private int playerLevel = 1;
	private long playerPoints = 0;

	public void setStatusFromMemento(PlayerStatusMemento memento) {
		this.playerLevel = memento.getPlayerStatus().getPlayerLevel();
		this.playerPoints = memento.getPlayerStatus().getPlayerPoints();
	}

	public PlayerStatusMemento createMementoFromStatus() {
		PlayerStatusMemento memento = new PlayerStatusMemento();
		PlayerStatus playerStatus = new PlayerStatus();
		playerStatus.setPlayerLevel(this.playerLevel);
		playerStatus.setPlayerPoints(this.playerPoints);
		memento.setPlayerStatus(playerStatus);
		return memento;
	}

	public void setPlayerPoints(long playerPoints) {
		this.playerPoints = playerPoints;
	}

	public long getPlayerPoints() {
		return this.playerPoints;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getPlayerLevel() {
		return this.playerLevel;
	}
	
	public static class PlayerStatusMemento {
		private PlayerStatus playerStatus;

		public void setPlayerStatus(PlayerStatus playerStatus) {
			this.playerStatus = playerStatus;
		}

		public PlayerStatus getPlayerStatus() {
			return playerStatus;
		}

	}

}