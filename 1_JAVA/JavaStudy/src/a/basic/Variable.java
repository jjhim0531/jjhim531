package a.basic;

public class Variable {
	/*
	 * 변수 : 값을 기록하고 사용하기 위한 메모리 공간. 값을 보관 하거나, 보관된 값을 가져와 사용할 수 있다.
	 * 
	 * [표현볍] (자료형) (변수이름);
	 * 
	 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
	 * 변수이름 : 변수를 식별하기 위해 붙여주는 이름
	 */
	public static void main(String[] args) {
		// 정수형 변수 num을 선언
		int num;
		
		// 정수형 변수 num에 10이란 값을 대입해라
		num = 10;
		System.out.println(num);
		
		// 참과 거짓을 표현하는 자료형으로 isTrue라는 이름의 변수를 만들어줘
		boolean isTrue = false;
		isTrue = true;
		isTrue = false;
		
		System.out.println(isTrue);
		
		// 실수형(소수점 6자리까지)자료형으로 num2라는 이름의 변수를 만들어줘\
		float num2;
		num2 = 3.14f;
		
		System.out.println(num2);
		
		
		
		// ===================[ 원시타입 자료형 ]======================
		// (숫자) : 바이트 수
		
		/*
		 * 정수 자료형
		 * byte(1), short(2), int(4), long(8)
		 * 모두 정수를 저장하는 자료형, 각 자료형마다 표현할 수 있는 수의 범위가 다르다.
		 */
		
		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;
		
		System.out.println("정수 자료형");
		System.out.println(by+", "+sh+", "+in+", "+lo);
		
		/*
		 * 실수 자료형
		 * float(4), double(8)
		 * 실수를 저장하는 자료형으로 float보다 double이 더 정밀한 수를 표현할 수 있다.
		 */
		
		float fl = 4.24f;
		double dou = 4.24;
		System.out.println("실수 자료형");
		System.out.println(fl + ", "+ dou);
		
		/*
		 * 문자 자료형
		 * char(2)
		 * 문자 하나를 담을 수 있는 자료형
		 * JAVA는 2바이트 유니코드로 표현한다.
		 */
		
		char ch1 = 'A';
		char ch2 = 'B';
		char ch3 = 'C';
		System.out.println("문자 자료형");
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.println(ch3);
		
		/*
		 * 논리 자료형
		 * boolean(1)
		 * true(참)와 false(거짓)을 저장하는 자료형
		 */
		
		boolean b1 = 10 > 5; // true
		boolean b2 = 20 == 10; // false
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		// =====================[ 객체 ]=======================
		
		/*
		 * 문자열
		 * String(객체)
		 * 문자열 같은 경우 할당해야할 메모리 크키가 가변적이므로 원시 타입이 아닌 객체로 변수를 만들어준다.
		 */
		
		String str1 = "병아리";
		String str2;
		str2 = "반달곰";
		
		String str3 = new String("안녕하세요"); // 객체 생성 방식으로 String 변수를 선언
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//문자열.equals(비교하고싶은 문자열)
		
		String name = "정주희";
		System.out.println("안녕하세요 저는 " + name +"입니다.");
		//System.out.printf(null, args);
		System.out.printf("안녕하세요 저는 %s입니다.\n", name);
		System.out.printf("안녕하세요 저는 %s입니다.\n", "아무개");
		System.out.printf("안녕하세요 저는 %s입니다.나이는 %d이고 키는 %.1f입니다.\n", "아무개",55,180.5);
		
		//	System.out.printf(문자열포맷, 값1, 값2);
		/*
		 * 포맷 안에서 쓸 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수(기본적으로 소수점 6자리까지 표현됨 but 원하는 만큼 표시하기 위해서는 %.숫자f 이렇게 표현하면됨 ex)%.1f, %.3f
		 */
		
		
		/*
		 * 이스케이프 시퀀스
		 * 문자열 내에서 탭, 백슬래시, 작은따옴표등을 코드로 사용하기 위한 방식
		 * 
		 * 탭 문자 \t
		 * 백슬래시 \\
		 * 작은따옴표 \'
		 * 큰따옴표 \"
		 * 개행문자 \n
		 * etc....
		 * 
		 * 등등 다양하게 있음
		 * 
		 */
		
		System.out.println("이렇게 말했다 \"저는 배고파요\" ");
		System.out.println("저는\n지금\n배가 고파요");
		
		/*
		 * 상수
		 * 수학에서의 상수는 변하지 않는 값
		 * 프로그래밍에서는 한번만 값을 할당할 수 있는 메모리
		 * 
		 * [표현법] final (자료형) (변수이름);
		 * 
		 * 상수의 이름을 모두 대문자로 짓는 것이 관례이다
		 * 이름이 둘 이상의 단어로 이루어질 경우 언더바로 연결해준다.
		 */
		
		final int MY_AGE;
		MY_AGE = 90;
		//MY_AGE = 111; 값을 초기화 하면 더이상 변경할 수 없다. error
		
	}
}
