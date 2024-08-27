package lang.wrapper;

public class WrapperUtilsMain {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);//숫자, 래퍼 객체 반환
		Integer i2 = Integer.valueOf("10");;//문자열, 래퍼 객체 반환
		int intValue = Integer.parseInt("10");;//문자열 전용, 기본형 반환

		int compareResult1 = i1.compareTo(20);
		System.out.println(compareResult1);
		int compareResult2 = i1.compareTo(10);
		System.out.println(compareResult2);
		int compareResult3 = i1.compareTo(5);
		System.out.println(compareResult3);

		System.out.println(Integer.sum(10, 20));
		System.out.println(Integer.min(10, 20));
		System.out.println(Integer.max(10, 20));

	}

}
