package text.t240705;

import java.util.Scanner;

public class T_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] gameArr = { "가위", "바위", "보" };

		int win = 0, draw = 0, lose = 0;

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();

		while (true) {

			int rand = (int) (Math.random() * 3);
			String com = gameArr[rand];
			System.out.println("컴퓨터 : " + com);

			System.out.print(name + " : ");
			String user = sc.next();

			// 컴퓨터에 랜덤으로 "가위, 바위, 보" 중 하나를 부여해야한다.
			// 문자열을 랜덤으로 줄 수 없으니 우리는 랜덤으로 숫자를 부여하자
			// 0(가위) 1(바위) 2(보)

//		int com = (int)(Math.random() * 3);//switch 문도 가능
//		gameArr[0] -> 가위
//		gameArr[1] -> 바위
//		gameArr[2] -> 보
			if (user.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", (win + draw + lose), win, draw, lose);

				break;

			}
			if (user.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else if ((user.equals("가위") && com.equals("보")) || (user.equals("바위") && com.equals("가위"))
					|| (user.equals("보") && com.equals("바위"))) {
				System.out.println("이겼습니다.");
				win++;

			} else {
				System.out.println("졌습니다.");
				lose++;

			}

		}

	}

}
