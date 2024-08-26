package test.t240703;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");

		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;

		}
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + " + ");

			}
		}
		System.out.print("= " + sum);

	}
}
