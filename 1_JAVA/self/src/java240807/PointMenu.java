package java240807;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		while (true) {
			System.out.println("==========메뉴==============");

			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				this.circleMenu();
				break;
			case 2:
				this.rectangleMenu();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	public void circleMenu() {
		System.out.println("===========원 메뉴===========");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴번호 : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			this.calcCircum();
			break;
		case 2:
			this.calcCircleArea();
			break;
//그리고 이번에는 default:를 따로 작성하지 않았기 때문에 1 ~ 2번 외의 숫자를 입력하면 아무것도 출력하지 않고 프로그램은 종료된다.

		}

	}

	public void rectangleMenu() {
		System.out.println("===========사각형 메뉴===========");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴번호 : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			this.calcPerimeter();
			break;
		case 2:
			this.calcReactArea();
			break;

		}

	}

	public void calcCircum() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();

		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);

	}

	public void calcCircleArea() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();

		String result = cc.calcArea(x, y, radius);
		System.out.println(result);

	}

	public void calcPerimeter() {
		
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int height = sc.nextInt();
		System.out.println("너비 : ");
		int width = sc.nextInt();
		
		String result = rc.calcPerimeter(x, y, height, width);
		System.out.println(result);
	}

	public void calcReactArea() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int height = sc.nextInt();
		System.out.println("너비 : ");
		int width = sc.nextInt();

		String result = rc.calcArea(x, y, height, width);
		System.out.println(result);
	}
}
