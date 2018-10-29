package state_pattern;

public interface VendingMachineState {
	public void selectProductAndInsertMoney(int amount, String productName);

	public void dispenseProduct();

}
