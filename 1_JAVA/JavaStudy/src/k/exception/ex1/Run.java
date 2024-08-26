package k.exception.ex1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("a/b....a : ");
			int n1 = sc.nextInt();
			System.out.println("a/b....b : ");
			int n2 = sc.nextInt();

			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
		} catch (ArithmeticException e) {
			System.out.println("수학적 에러 발생");
			System.out.println("good bye~");

		}

	}

}
