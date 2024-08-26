package java240726;

import java.util.Scanner;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();

	public void menu() {
		System.out.println("종류 : ");
		String kind = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("맛 : ");
		String flavor = sc.next();
		System.out.println("수량 : ");
		int numOf = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();

		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);

		System.out.print("저장된 정보를 확인하시겠습니까? (y/n) : ");
		char answer = sc.next().charAt(0);
		if (answer == 'y') {
			String res = scr.confirmData();
			System.out.println(res);

		}

	}

}
