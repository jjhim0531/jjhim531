package test240723.object2;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {

		// 사용자에게 두 정수를 입력 받아 NumberController의 checkDouble()에
		// 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 checkDouble()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리

		try (Scanner sc = new Scanner(System.in)) { // 자동으로 닫힘
			while (true) {
				try {
					System.out.print("정수1 (종료하려면 0 입력) : ");
					int num1 = sc.nextInt();
					if (num1 == 0)
						break; // 종료 조건 추가
					
					System.out.print("정수2 : ");
					int num2 = sc.nextInt();

					NumberController nc = new NumberController();
					boolean isDouble = nc.checkDouble(num1, num2);
					System.out.printf("%d은(는) %d의 배수인가 ? %b \n\n", num1, num2, isDouble);

				} catch (NumRangeException e) {
					e.printStackTrace();
				} catch (java.util.InputMismatchException e) {
					System.out.println("올바른 정수를 입력하세요.");
					sc.next(); // 잘못된 입력 제거 후 다시 입력받기
				}
			}
		} // try-with-resources 블록 종료 후 메시지 출력
		System.out.println("잘 종료되었습니다.");
	}
}
//try-with-resources 구문을 사용하고 있기 때문에, Scanner의 close()를 직접 호출하지 않아도 됩니다.
//(try (resource) { ... })을 사용하면, 리소스를 자동으로 관리한다.
//이 구문을 사용하면, try 블록이 끝날 때 자동으로 close() 메서드를 호출하여 리소스를 정리
//즉, 메모리 누수가 발생하지 않는다.
