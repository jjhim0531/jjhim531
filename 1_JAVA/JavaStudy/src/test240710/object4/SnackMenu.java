package test240710.object4;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);

	private SnackController scr = new SnackController();

	public void menu() {
		String kind;
		String name;
		String taste;
		int num;
		int price;

		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		kind = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("맛 : ");
		taste = sc.next();
		System.out.print("개수 : ");
		num = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();

		String res = scr.saveData(kind, name, taste, num, price);
		System.out.println(res);

		System.out.print("저장된 정보를 확인하시겠습니까?(y/n) : ");
		String answer = sc.next();
		if (answer.equals("y")){
			res = scr.confirmData();
			System.out.println(res);
		}
	}

}
