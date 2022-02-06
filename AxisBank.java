package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit method in axis bank class");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();

		axis.deposit();
		axis.fixed();
		axis.saving();
	}

}
