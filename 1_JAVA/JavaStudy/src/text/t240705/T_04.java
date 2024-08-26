package text.t240705;

import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("A사원의 연봉 : ");
		int m1 = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int m2 = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		int m3 = sc.nextInt();

		double plus1 = 1.4 * m1;
		double plus2 = m2;
		double plus3 = 1.15 * m3;

	
		System.out.printf("A사원의 연봉/연봉 +a : %d/%f\n", m1, plus1);
		System.out.println(plus1>=3000? "3000이상" : "3000미만");
	
		System.out.printf("B사원의 연봉/연봉 +a : %d/%f\n", m2, plus2);
		System.out.println(plus1>=3000? "3000이상" : "3000미만");
		
		System.out.printf("C사원의 연봉/연봉 +a : %d/%f\n", m3, plus3);
		System.out.println(plus1>=3000? "3000이상" : "3000미만");
	}

}
