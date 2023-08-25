package testProject;

public class MainStart {
	public static void main (String[] args) {
		BankAccountPO choi1 = new BankAccountPO();
		BankAccountPO choi2 = new BankAccountPO(1000);
		BankAccountPO choi3 = new BankAccountPO(1000, "지원");

		choi1.checkMyBalance();
		choi2.checkMyBalance();
		choi3.checkMyBalance();
	}
}
