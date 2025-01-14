package f.object.ex2;

public class BankAccount {
	// 필드영역
	int balance = 0;

	// 메소드영역
	public void deposit(int amount) {
		// void : 값을 반환하지 않고, 내부적으로 작업만 수행합니다
		// return은 선택 사항 (메서드를 종료하려면 사용 가능)
		balance += amount;// 잔액에 금액을 추가
	}

	// public int deposit(int amount) {
	// 		balance += amount; // 잔액 증가
	// 		return balance; // 변경된 잔액 반환
	// }

	public int withdraw(int amount) {
		// 작업 결과를 다른 곳에서 사용해야 할 때
		// 반환 타입이 int라면, 반드시 return 키워드를 통해 정수 값을 반환해야함.

		balance -= amount; // 잔액에서 금액을 차감
		return balance; // 남은 잔액 반환
	}

	public void checkMyBalance(int balance) {
		// 영역안에서 변수를 찾을 때는 가장 작은 단위부터 탐색한다.
		// 지역변수 우선 -> 이후에 필드값
		// this키워드 사용시 접근한 객체의 필드값을 가져올 수 있다.
		//checkMyBalance 메소드에서 출력하는 값은 this.balance 필드의 값으로, 매개변수 balance와는 전혀 관련이 없습니다.
		System.out.println("입력된 값 : " + balance);
		System.out.println("잔액 : " + this.balance);
	}
}
