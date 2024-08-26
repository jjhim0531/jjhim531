package text.t240705;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" 국어 : ");
		double ko = sc.nextDouble();
		
		System.out.println(" 영어 : ");
		double en = sc.nextDouble();
		
		System.out.println(" 수학 : ");
		double ma = sc.nextDouble();
		
		
		int all = (int) (ko + en + ma);
		int avg = (int) (all / 3);

		System.out.println("\n총점 : " + all);
		System.out.println("평균 : " + avg);

	}

}
