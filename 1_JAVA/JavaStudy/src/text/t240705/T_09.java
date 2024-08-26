package text.t240705;

import java.util.Scanner;

public class T_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			} else if (num > 0) {
				for (int i = 0; i < num; i++) {
					System.out.print((i % 2 == 1) ? "박" : "수");

				}
				System.out.println();

			} else {
				System.out.println("양수가 아닙니다.");
			}

		}

	}

}
