package testProject;

public class BankAccountPO {
	int balance = 0; //예금 잔액
	String name;
	
	public BankAccountPO() {
		
	}
	public BankAccountPO(int money) {
		balance = money;
	}
	public BankAccountPO(int money, String n) {
		balance = money;
		name = n;
	}

	public int deposit(int amount) { //입금
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) { //출금
		balance -= amount;
		return balance;
	}
		
	public int checkMyBalance() { //예금 조회
		System.out.println("잔액 :" + balance);
		return balance;
	}
	
	
}

	


