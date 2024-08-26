package java240719;

public class Run2 {

	public static void main(String[] args) {
		Account ac = new Account();

		ac.deposit(10000);

		System.out.println("잔고 : " + ac.balance);

		ac.withdraw(9000);
		System.out.println("잔고 : " + ac.balance);

		ac.withdraw(2000);
		System.out.println("잔고 : " + ac.balance);

		System.out.println("최종 잔고 : " + ac.balance);

	}
	

}
