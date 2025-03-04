package m.api.ex1;

import java.util.StringTokenizer;

public class B_String {

	public void method01() {
		// 1. 생성자를 통한 문자열생성
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1);
		System.out.println(str2);
		// String 클래스에 toString 메소드는 기본적으로 이미 오버라이딩 되어있음.

		// 주소값을 비교하기 때문에 false가 나옴
		System.out.println(str1 == str2);

		// String 클래스에서 equals 메소드는 이미 오버라이딩이 되어있음(주소값이 아닌 값 비교)
		System.out.println(str1.equals(str2));

		// String 클래스에서의 hashCode 메소드는 이미 오버라이딩이 되어있음(주소값이 아닌 문자열을 가지고 만들도록)
		// 원래의 hashCode 메소드는 고유의 값이 나와야함.
		System.out.println(str1.hashCode());

		// 실제 고유의 hashCode값이 나오는 메소드.(각각 고유의 값)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

//----------------------------------------------------------------------------------------

		// 2. 문자열을 리터럴 값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		// 리터럴 제시 시 상수풀 영역에 들어감
		// String Pool 특징 : 동일한 문자열을 가질 수 없다.
		// 문자열 리터럴을 "문자열 상수 풀(String Pool)"이라는 특별한 메모리 영역에 저장.
		// 같은 문자열 리터럴은 한 번만 저장되고, 이후에는 재사용.
		// → "hello"라는 문자열이 String Pool에 이미 존재하면, 새로운 공간을 만들지 않고 기존의 "hello"를 가리킴.
		// == 연산자가 true 반환 → 리터럴로 만든 문자열은 같은 객체이므로 주소값 비교에서도 true가 나옴.

		System.out.println(str3);
		System.out.println(str4);

		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		System.out.println(str3 == str4);// true
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경되는 것이 아니고
		// 새로운 곳을 참조하도록 됨(새로운 주소값 부여받음 == 주소값 변경)
	}

	public void method02() {
		String str1 = "Hello World";
		
		//1. 문자열.charAt(int index) : 반환형은 char
		//   문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴(공백은 무시)
		char ch = str1.charAt(6);
		System.out.println("ch : " + ch);
		
		//2. 문자열.concat(String str) :  반환형은 String
		//   문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// 3. 문자열.contains(CharSequence str) : 반환형은 boolean
		//    문자열에 전달된 문자열이 포함되어 있는지를 반환
		System.out.println("str1에 Hello라는 문자열이 포함? : " + str1.contains("Hello"));//true
		System.out.println("str1에 Bye라는 문자열이 포함? : " + str1.contains("Bye"));//false
		
		// 4. 문자열.substring(int beginIndex, [int endIndex]) : 반환형은 String 
		//    문자열을 beginIndex 위치부터 endIndex-1 위치까지 추출해서 반환
		//	  endIndex를 생략한 경우에는 문자열의 끝까지 반환.
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(6, 9));
		
		//5. 문자열.replace(char oldChar, char newChar) : 반환형은 String
		//   문자열에서 oldChar문자를 newChar문자로 변환한 채 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println("str1 : " + str1);
		System.out.println("str4 : " + str4);
		
		//6. 문자열.toUpperCase() : String => 문자열을 전부 대문자로 변경해서 반환
		//   문자열.toLowerCate() : String => 문자열을 전부 소문자로 변경해서 반환
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//7. 문자열.trim() : 반환형은 String
		//   문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		//	 아이디, 키워드 같은 것들에 사용자가 실수로 공백을 입력하면 오류가 나오므로 trim 처리를 해주는게 좋다.
		String str5 = "    JA  va     ";
		System.out.println(str5.trim());//JA  va
		
		//8. 문자열.toCharArray() : 반환형은 char[]
		char[] arr = str1.toCharArray();
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("char[" + i + "] : " + arr[i]);
		}
		
		// valueOf는 클래스에 따라 다른 기능으로 작동하는 메소드이다.
		
		//9. valueOf(배열) - 배열이 String으로 변환된다.
		//String.valueOf()는 어떤 객체든 문자열로 변환할 수 있다. 단, 배열의 메모리 주소 출력: [I@주소값
		System.out.println(String.valueOf(arr));
		//배열 내용을 문자열로 보고 싶다면 : 
		//Arrays.toString(arr)을 사용해야 배열의 내용을 사람이 읽을 수 있는 문자열로 출력할 수 있다.
		
	}

	public void method03() {
		//DB는 배열이란 개념이 없고 모두 원시타입인 String으로 저장해야한다. 
		//그러므로 String과 배열의 호환을 잘 할줄 알아야한다.
		String str = "Java,Oracle,sql,html,css,spring";

		// 구분자를 기준으로 문자열을 분리시키는 방법

		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할때
		// String 클래스에서 제공하는 split 메소드를 사용
		// 문자열.split(구분자) : 반환형은  String[]

		String[] arr = str.split(",");
		for (String st : arr) {
			System.out.println("구분자는 , : " + st);
		}

		// 분리된 문자열 배열을 다시 String으로 변경하는 방법
		// String.join(구분자, 배열);
		// 구분자 기본은 콤마.(아무것도 안써주면 콤마로 구분해줌)
		// 공백 포함 원하는 것으로 써주면 그것으로 구분되어서 출력됨.

		String str2 = String.join(" / ", arr);
		
		System.out.println("배열 str2 :" + str2);

		// 방법2. 분리된 문자열들을 각각 토큰으로써 관리가능
		// java.util.StringTokenizer클래스를 이용
		// StringTokenizer stn = new StringTokenizer(문자열, 구분자)
		StringTokenizer stn = new StringTokenizer(str, ",");

		System.out.println(stn.countTokens());

		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());

		System.out.println(stn.countTokens());

//		System.out.println(stn.nextToken()); 
		// 더이상 토큰이 남아있지 않을 때 다음 토큰을 가져오려고 하면 예외발생!

		stn = new StringTokenizer(str, ",");
		// 모든 토큰을 조회하는 방법1
		int count = stn.countTokens();
		for (int i = 0; i < count; i++) {
			System.out.println(stn.nextToken());
		}

		// hasMoreElements -> 가져올 토큰이 남아있는지 확인해주는 메소드.
		// 남아있다면 true 반환, 없다면 false 반환
		stn = new StringTokenizer(str, ",");
		while (stn.hasMoreElements()) {
			System.out.println(stn.nextToken());
		}
	}
}
