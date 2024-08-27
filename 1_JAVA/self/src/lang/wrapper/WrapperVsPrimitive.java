package lang.wrapper;

public class WrapperVsPrimitive {

	
	public static void main(String[] args) {
		int iterations = 1_000_000_000;//10억
		long startTime, endTime;
		long sumPrimitive = 0;
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < iterations; i++) {
			sumPrimitive += i;
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("sumPrimitive = " + sumPrimitive);
		System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");
		// 래퍼 클래스 Long 사용
		
		Long sumWrapper = 0L;
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < iterations; i++) {
			sumWrapper += i; // 오토 박싱 발생
		}
		endTime = System.currentTimeMillis();
		System.out.println("sumWrapper = " + sumWrapper);
		System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");

		
		System.out.println("결론 : 기본형 연산이 래펴클래스보다 대략 5배정도 빠르다");
	}

}
