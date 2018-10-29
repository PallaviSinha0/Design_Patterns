package state_pattern;

public class HasMoneyState implements VendingMachineState {

	@Override
	public void selectProductAndInsertMoney(int amount, String productName) {
		System.out.println(
				"Vending machine has money and product selected,So wait till it finishes the current dispensing process ... ");

	}

	@Override
	public void dispenseProduct() {
		System.out.println("Vending Machine  dispensed the product ...");

	}

}
