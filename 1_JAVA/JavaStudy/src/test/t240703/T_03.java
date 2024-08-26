package test.t240703;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		

		System.out.print("국어점수 : ");
		num1 = sc.nextInt();
		System.out.print("수학점수 : ");
		num2 = sc.nextInt();
		System.out.print("영어점수 : ");
		num3 = sc.nextInt();
		double sum = num1 + num2 + num3;
		double avg = sum / 3;
		if (num1 >= 40 && num2 >= 40 && num3 >= 40 && avg >= 60) {
			
			
			
			System.out.println("국어접수 : " + num1);
			System.out.println("수학접수 : " + num2);
			System.out.println("영어접수 : " + num3);

			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f", avg);
			System.out.println();


			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
