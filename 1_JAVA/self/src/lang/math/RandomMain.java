package lang.math;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {

		//new Random(int seed) : seed값이 같으면 결과값이 항상 똑같다.
		Random rd = new Random();
		

		// 랜덤 int값을 반환
		int rdInt = rd.nextInt();
		System.out.println(rd);
		System.out.println(rdInt);

		// 랜덤 double값을 반환
		double rddb = rd.nextDouble();
		System.out.println(rddb);

		// 랜덤 boolean값을 반환
		boolean rdboolean = rd.nextBoolean();
		System.out.println(rdboolean);

		// 범위 조회
		// nextInt(int bound) : 0 ~ bound 미만의 숫자를 랜덤으로 반환한다.
		// 예를 들어서 3을 입력하면 0, 1, 2 를 반환한다.
		// 1부터 특정 숫자의 int 범위를 구하는 경우 nextInt(int bound) 의 결과에 +1을 하면 된다
		int randomRange1 = rd.nextInt(10); // 0 ~ 9까지 출력
		System.out.println("0 ~ 9: " + randomRange1);
		
		int randomRange2 = rd.nextInt(10) + 1; // 1 ~ 10까지 출력
		System.out.println("1 ~ 10: " + randomRange2);

	}

}
