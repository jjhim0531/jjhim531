package test.t240704;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);

		char[] chArr = new char[str.length()];

		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		int count = 0;
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.println();
		System.out.println("인덱스의 갯수 : " + count);

	}

}
