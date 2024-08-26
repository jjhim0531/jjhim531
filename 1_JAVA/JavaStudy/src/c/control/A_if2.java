package c.control;

import java.util.Scanner;

public class A_if2 {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * //나이를 입력받아 //13세 이하 : 어린이 //13세 초과 19세 이하 : 청소년 //19세 초과 : 성인 // 나이를 입력 : xx
		 * // xx세는 xxx에 속합니다.
		 * 
		 * int num1; System.out.print("나이를 입력해주세요 : "); num1 = sc.nextInt();
		 * sc.nextLine(); if(num1<=13) { System.out.printf("%s세는 어린이에 속합니다.", num1); }
		 * else if(13<num1 && num1<=19) { System.out.printf("%s세는 청소년에 속합니다.", num1);
		 * }else { System.out.printf("%s세는 성인에 속합니다.", num1); }
		 */

		// 성별을 (m/f)(대소문자 상관 x) 로 입력받아 남학생인지 여학생인지
		// 출력하는 프로그램을 작성하세요
		// 성별(m/f) : X
		// 여학생입니다. 남학생입니다. 잘못입력하셨습니다.

		/*
		 * Scanner sc = new Scanner(System.in); char gender;// String도 가능함 String
		 * result; System.out.print("성별 : "); gender = sc.nextLine().charAt(0);// 실수로라도
		 * 여러문자를 입력했어도 맨 처음 문자만 가져옴.
		 * 
		 * if (gender == 'f' || gender == 'F') { result = "여학생";
		 * 
		 * } else if (gender == 'm' || gender == 'M') { result = "남학생"; } else {
		 * System.out.println("잘못입력하셨습니다."); return;// 함수를 끝낸다.
		 * 
		 * } System.out.println(result + "입니다.");
		 */

		// 정수(양수)를 입력받아
		// 짝수인지 홀수인지 출력하는 프로그램을 작성해라

		// 정수입력 : xx
		// 짝수다 홀수다 양수가 아닙니다.

		/*
		 * Scanner sc = new Scanner(System.in); 
		 * int num1; 
		 * System.out.print("정수입력 : ");
		 * num1 = sc.nextInt();
		 * 
		 * if(num1>0 && num1%2==0) { 
		 * 		System.out.println("짝수다"); 
		 * } else if(num1>0 && num1%2==1) {
		 * 		System.out.println("홀수다"); 
		 * }else { 
		 * 		System.out.println("양수가 아닙니다."); 
		 * }
		 */

		// 과일을 구매하는 프로그램을 작성해봅시다.
		// 구매하고자 하는 과일을 입력하면
		// 그에 맞는 가격이 출력되는 프로그램을 작성해주세요
		// 구매하고자 하는 과일(사과(2000), 바나나(3000), 딸기(5000)) 입력 :
		// xx의 가격은 xxxx입니다. 잘못입력하셨습니다.

		/*Scanner sc = new Scanner(System.in);
		String fruit;

		System.out.print("구매하고자 하는 과일 입력 : ");
		fruit = sc.nextLine();
		switch (fruit) {
		case "사과":
			System.out.printf("사과의 가격은 2000원입니다.");
			break;
		case "바나나":
			System.out.printf("바나나의 가격은 3000원입니다.");
			break;
		case "딸기":
			System.out.printf("딸기의 가격은 5000원입니다.");
			break;
		default:
			System.out.printf("잘못입력하셨습니다.");

			if (fruit.equals("사과")) {

				System.out.printf("사과의 가격은 2000원입니다.");

			} else if (fruit.equals("바나나")) {
				System.out.printf("바나나의 가격은 3000원입니다.");
			} else if (fruit.equals("딸기")) {
				System.out.printf("딸기의 가격은 5000원입니다.");
			} else {
				System.out.printf("잘못입력하셨습니다.");
			}*/
		
		
		//월을 입력받아 해당월에 말일이 며칠까지 있는지를 출력하는 프로그램 작성
		//월을 입력하세요 : xx
		//xx월은 xx일까지입니다.
		//1,3,5,7,8,10,12=>31
		//4,6,9,11=>30
		//2=>28
	
		Scanner sc = new Scanner(System.in);
		int month, day;
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
		case 2:
			day=28;
			break;
		default:
			System.out.println("잘못입력하였습니다.");
			return;
	}
	System.out.println(month + "월은 " + day +"일까지입니다.");
		
		
		
		

		
	}

}
