package java240712;

public class Calculator {

	public double getSum(int data) {

		int sum = 0;

		if (2 <= data && data <= 5) {
			for (int i = 0; i <= data; i++) {
				sum += i;

			}
		} else {
			System.out.println("입력 값에 오류가 있습니다.");
		}
		return sum;
	}

}
