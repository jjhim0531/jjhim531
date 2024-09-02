package nested.nested;

public class NestedOuterMain {
	public static void main(String[] args) {
		NestedOuter outer = new NestedOuter();
		// 중첩클래스 생성방법 : 바깥클래스.중첩클래스
		NestedOuter.Nested nested = new NestedOuter.Nested();
		nested.print();
		System.out.println("nestedClass = " + nested.getClass());
//		여기서 new NestedOuter() 로 만든 바깥 클래스의 인스턴스와 new NestedOuter.Nested() 로 만든
//		정적 중첩 클래스의 인스턴스는 서로 아무 관계가 없는 인스턴스이다. 단지 클래스 구조상 중첩해 두었을 뿐이다.
//		참고로 둘이 아무런 관련이 없으므로 정적 중첩 클래스의 인스턴스만 따로 생성해도 된다
	}
}
