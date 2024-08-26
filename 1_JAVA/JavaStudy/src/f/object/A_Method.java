package f.object;

public class A_Method {
//	메소드(class 내부에 잇는 함수를 우리는 메소드라고 함)
//	[표현법]
//			반환형 메소드 이름(매개변수)

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램 끝");
	}

	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
	}

}
