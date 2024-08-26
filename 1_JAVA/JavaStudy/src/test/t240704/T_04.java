package test.t240704;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan <= 9) {

			for (int j = dan; j <= 9; j++) {
				System.out.println("=========== " + j + "단 =========");
				for (int i = 1; i <= 9; i++) {
					System.out.println(j + " * " + i + " = " + dan * i);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}

	}

}
