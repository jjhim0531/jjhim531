package test.t240704;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("0~6사이의 숫자 입력 : ");
		int date = sc.nextInt();
		
		String[] str = {"일", "월", "화", "수", "목","금","토"};
		
		
		if (0 <= date && date <= 6) {
				System.out.println(str[date]+"요일");
			

			
		} else {
			System.out.println("잘못 입력하셨습니다.");

		}

	}

}
