package m.api.ex1;
//import java.lang.*; // 내가 직접 import 하지 않아도 무조건 import 됨.

public class A_Math {
	//java.lang.Math
	// - 모든 필드 상수 필드, 모든 메소드 static 메소드이다.
	//Math는 객체가 아니라 정적 메서드만 있는 클래스
	//객체를 만들 수 없고, Math의 모든 기능은 static 메서드로 접근해야한다.(Math.메서드명)
	public void method01(){
		//상수필드
		System.out.println("파이 : " + Math.PI);
		
		//랜덤수
		System.out.println("랜덤(0 ~ 0.99) : " + Math.random());
		
		//절대값을 알고싶다
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		//올림
		double num2 = 4.49;
		System.out.println("올림 : " + Math.ceil(num2));
		
		//반올림
		System.out.println("반올림 : " + Math.round(num2));
		
		//버림
		System.out.println("버림 : " + Math.floor(num2));
		
		//제곱
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
	}
}


