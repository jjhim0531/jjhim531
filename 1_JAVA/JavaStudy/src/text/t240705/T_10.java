package text.t240705;

import java.util.Scanner;

public class T_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 : ");
			String str = sc.next();

			System.out.print("문자 : ");
			char target = sc.next().charAt(0);

			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == target) {
					count++;

				}
			}
			System.out.println("포함된 개수 : " + count);
			while (true) {
				System.out.println("더 하시겠습니까? (y/n) : ");

				target = sc.next().charAt(0);
				if (!(target == 'n' || target == 'N' || target == 'y' || target == 'Y')) {
					System.out.println("잘못입력했습니다. 다시 입력해주세요.");

				} else {
					break;
				}
				if (target == 'n' || target == 'N') {
					break;

				}
			}
		}
	}

}
