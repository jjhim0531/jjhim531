package text.t240705;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a, b;

			System.out.print("첫번째 숫자 : ");
			a = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			b = sc.nextInt();

			int max = (a > b) ? a : b;
			int min = (a < b) ? a : b;

			if (a < 1 || b < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");

			} else {
				for (int i = min; i <= max; i++) {

					System.out.print(i + " ");

				}
				break;

			}
		}
	}

}
