package f.object;

public class A_Method2 {

	public static void main(String[] args) {
		System.out.println(adder(123, 444));
		System.out.println(adder(90));
		System.out.println(adder(90.3));

	}

	// 반환형 메소드이름(매개변수)
	public static int adder(int num1, int num2) {
		int result = num1 + num2;
		return result;

	}

	//매개변수의 갯수 또는 타입이 다르면 메소드를 구분할 수 있다. -> 메소드 오버로딩
	//단, 반환형의 이름이 같은 경우에는 구분할 수 없다. 반환형은 함수에 따라 자료형이 달라지기에 컴퓨터 입장에서는 파악불가능.
	public static int adder(int num) {
		int result = num + 10;
		return result;

	}

	public static int adder(double num) {

		return (int) (num + 10);

	}
}
