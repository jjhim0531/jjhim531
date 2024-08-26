package test240711.object1;

import java.util.Scanner;

public class T_01 {
	
	public static void main(String[] args) {
		// 정수 n(2~9)를 입력받아 2부터 n까지 중 짝수의 구구단을 출력하는 코드를 작성하세요
		// 만약 2~9사이의 값을 입력하지 않는다면 "다시 입력하세요"를 반복합니다.
		Scanner sc = new Scanner(System.in);
		while(true) {System.out.print("숫자입력 : ");
		int n = sc.nextInt();

		if (n < 2 || n > 9) {
			System.out.println("다시 입력하세요");
			continue;
		}
		
for (int j = 2; j <= n; j += 2) {
				if (j % 2 == 0) {
					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", j, i, (j * i));
					}
					System.out.println();

				}
}
		}

	}
}
