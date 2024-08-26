package b.opaerator;

import java.util.Scanner;

public class Operator6 {
	/*
	 * 삼항연산자 [표현식] 조건식 ? 조건식이 "참"일 경우 결과값 : 조건식이 "거짓"일 경우 결과값
	 * 
	 * 이떄, 조건식은 반드시 true 또는 false가 나오는 논리값이어야한다. 주로 비교, 논리연산자를 통해서 작성한다. 결과값에 또 중첩을
	 * 해버리면 너무 가독성이 떨어진다. 삼항연산자를 쓰는 이유는 간단화하기 위해서이다. 그러므로 삼항연산자를 쓸 때는 중첩을 하지 말자. 짧은
	 * 코드가 멋있는게 아니다!!
	 * 
	 */

	public static void main(String[] args) {
//		int num = (3 > 10) ? 10 : 20;
//
//		System.out.println(num);

		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력해라.
		// 정수값 입력 :
		// 양수 / 음수

		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("정수값 입력 : ");
		num1 = sc.nextInt();
		sc.nextLine();

		System.out.println((num1 > 0) ? "양수" : "음수");

	}

}
