package text.t240705;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mid, fin,sub, check;
		
		System.out.print("중간 고사 점수 : ");
		mid = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		sub = sc.nextDouble();
		System.out.print("출석 회수 : ");
		check = sc.nextDouble();
		
		double mid2 = 0.2*mid;
		double fin2 = 0.3*fin;
		double sub2 = 0.3*sub;
		
		System.out.println("==========결과===========");
		System.out.printf("중간고사 점수(20) : %f\n", mid2);
		System.out.printf("기말고사 점수(20) : %f\n", fin2);
		System.out.printf("과제 점수(30) : %f\n", sub2);
		System.out.printf("출석 점수(20) : %f\n", check);
		
		double all =  mid2+fin2+sub2+check;
		System.out.printf("총점 : %f\n", all);
		
		if(all<70 || check<14) {
			System.out.println("Fail(점수미달)");
		}else {
		System.out.println("Pass");
		}
		

	}

}
