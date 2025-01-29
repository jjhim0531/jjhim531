package m.api.ex1;

public class C_Wrapper {
	/*
	 * * Wrapper 클래스
	 * => 기본자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스이다.
	 * 
	 * 		boolean(Boolean)
	 * 		char(Character)
	 * 		byte(Byte)
	 * 		short(Short)
	 * 		int(Integer)
	 * 		long(Long)
	 * 		float(Float)
	 * 		double(Double)
	 * 
	 * => 기본자료형을 객체로 표현해야할 경우
	 *  - 메소드 호출해야할 때
	 *    -> 메소드의 매개변수가 기본자료형이 아닌 객체타입만 요구될 때
	 *  - 다형성을 적용시키고 싶을 때
	 */

	public void method01() {
		
		//Boxing : 기본자료형 -> Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 20;
		
		//System.out.println(num1.equals(num2));
		//equals 같은 메서드를 쓰려면 객체여야한다. 원시타입으로는 안됨.
		
		//1. 객체생성구문을 통한 방법
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num2 => i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		//객체로 만든 후부터는 ==비교는 쓰지말고 equals로 비교해야한다.
		
		System.out.println(i1.compareTo(i2)); 
		//두 값을 비교해서 앞쪽이 크면 1 반환, 뒤쪽이 크면 -1 반환, 같으면 0 반환
		
		//2. 객체생성따위 하지않고 곧바로 대입 방법(AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);		

		//// 문자열을 Integer로 변환하는 다양한 방법(반드시 객체생성을 통해 변환해야한다)

			// 1. 문자열을 int로 변환한 뒤 AutoBoxing으로 Integer로 변환
			Integer i4 = Integer.parseInt("123");
	
			// 2. (Deprecated) 직접 객체 생성
			Integer i5 = new Integer("123");  // 비추천 (Java 9 이상에서는 사용 X)
	
			// 3. 문자열을 바로 Integer 객체로 변환
			Integer i6 = Integer.valueOf("123");  // 권장

		
//---------------------------------------------------------------------------------------------------		
			
		// UnBoxing : Wrapper 클래스 자료형 -> 기본자료형
		
		//1. 해당 Wrapper 클래스에서 제공하는 xxxValue()메소드를 통해서 가능
		int num3 = i3.intValue();
		int num4 = i4.intValue();
		
		// 2. 메소드사용하지 않고 바로 대입하는 방법
		int num5 = i3;
		
		// 기본자료형 < -- > String
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 + str2);//1015.5
		
		// String -> 기본자료형
		//   "10" ->  10
		//  "15.5" ->  15.5
		//해당 Wrapper클래스.parsexxx()사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d);//10 + 15.5 = 25.5
		
		// 기본자료형 -> String
		System.out.println(i + "");
		System.out.println(String.valueOf(i));
		System.out.println(String.valueOf(d));
	}
}









