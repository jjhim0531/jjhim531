package a.basic;
import java.util.Scanner;
public class Practice2 {
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로)*2
	 * 
	 * 가로 : (키보드로 입력)
	 * 세로 : (키보드로 입력)
	 * 소수점 2번쨰 자리까지만 출력하세요
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	double num1, num2;
		
	 System.out.print("가로 : ");
	 num1 = sc.nextDouble();
	 sc.nextLine();//키보드로 정보를 입력후 엔터를 치면 엔터를 개행문자로 인식하기에 sc.nextLine();으로 엔터를 잡아준다.
	 
	 System.out.print("세로 : ");
	 num2 = sc.nextDouble();
	 sc.nextLine();
		
	 System.out.printf("면적 : %.2f\n", num1*num2);
	 System.out.printf("둘레 : %.2f", (num1+num2)*2);

	}

}
