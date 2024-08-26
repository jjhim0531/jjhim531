package text.t240705;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator;

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			operator = sc.next();
			
			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수 1 : ");
			int a = sc.nextInt();

			System.out.print("정수 2 : ");
			int b = sc.nextInt();

			int cal=0;
			switch (operator.charAt(0)) {
			case '+':
				cal = a + b;
				break;
			case '-':
				cal = a - b;
				
				break;
			case '*':
				cal = a * b;
				break;
			case '/':
				if (b == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
					break;
				}
				cal = a / b;
				break;
			case '%':
				cal = a % b;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요");

			}
			System.out.printf("%d %s %d = %d\n", a, operator.charAt(0), b, cal);
		
		}
	}
}
