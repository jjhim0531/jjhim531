package f.object.ex2;

public class Run {

	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;// ref2도 같은 객체를 참조
		
		ref1.deposit(3000); // 객체의 balance를 3000으로 증가
		ref2.deposit(2000); // 같은 객체의 balance를 2000 추가
		// ref1과 ref2가 동일한 객체를 참조하기 때문에, 두 변수 모두 같은 BankAccount 객체의 balance 값을 변경합니다.
		
		ref1.checkMyBalance(1000);
		ref2.checkMyBalance(0);
	}

}
