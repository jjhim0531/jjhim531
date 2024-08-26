package java240719;

public class Account {
	int balance;

	public Account() {
		super();
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;

	}

	void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액부족");
		} else {
			balance -= amount;

		}
	}

}
