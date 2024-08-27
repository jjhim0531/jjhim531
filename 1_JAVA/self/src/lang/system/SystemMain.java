package lang.system;

import java.util.Arrays;

public class SystemMain {

	public static void main(String[] args) {

		// 현재 시간(밀리초)를 가져온다.
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("currentTimeMillis: " + currentTimeMillis);
		
		// 현재 시간(나노초)를 가져온다.
		long currentTimeNano = System.nanoTime();
		System.out.println("currentTimeNano: " + currentTimeNano);
		
		// 환경 변수를 읽는다.
		System.out.println("getenv = " + System.getenv());
		
		// 시스템 속성을 읽는다.
		System.out.println("properties = " + System.getProperties());
		//특정 속성 : System.getProperty(String key)
		System.out.println("Java version: " + System.getProperty("java.version"));
		
		// 배열을 고속으로 복사한다.System.arraycopy - 반복문을 통한 복사보다 수배 이상 빠른 성능을 제공한다.
		char[] originalArray = new char[] { 'h', 'e', 'l', 'l', 'o' };
		char[] copiedArray = new char[5];
		System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
		
		// 배열 출력
		System.out.println("copiedArray = " + copiedArray);
		System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));
		
		// 프로그램 종료(int status) - 상태코드 0: 정상종료 // 상태코드 0이 아님 : 오류나 예외적인 종료
		System.exit(0);

	}

}
