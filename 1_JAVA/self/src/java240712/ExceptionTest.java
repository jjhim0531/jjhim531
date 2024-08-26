package java240712;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		e.test();
	}
	
	public void test(){
		Calculator c = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("결과값 : " + c.getSum(num));
	}

}
