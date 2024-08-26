package test.t240704;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 숫자 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max = num1 < num2 ? num2 : num1;
		int min = num1 < num2 ? num1 : num2;

		if (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		} else  {
			for (int i = min; i < max; i++) {
				System.out.print(i + " ");
			}
		} 

	}

}
