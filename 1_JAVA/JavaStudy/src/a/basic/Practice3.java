package a.basic;
import java.util.Scanner;
public class Practice3 {
	/*
	 * 문자열 => 객체(기능들이 있다)
	 * ex) 문자열비교시 -> 문자열.equals(비교문자열)
	 * 
	 * 문자열.chatAr(index) : 문자열에서 내가 원하는 index의 글자를 가져온다.
	 * index :  순서를 지정할 때 사용하는 것(0부터 시작)
	 * 
	 * 
	 * 영어 단어를 키보드로 입력받아 단어의 앞에서부터 3개를 출력하세요.
	 * ex)apple -> app
	 * 
	 * 단어를 입력하세요 : (키보드로 입력)
	 * 첫번째 분자 : 
	 * 두번째 문자 : 
	 * 세번째 문자 : 
	 * 
	 */

	public static void main(String[] args) {
		String str1 = "joohee";
		str1.equals("joohee");
		char ch1 = str1.charAt(0);//넘치는 숫자를 넣으면 에러가 난다.
		
		System.out.println(ch1);
		
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.print("단어를 입력하세요 : ");
		str = sc.nextLine();
	
		
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
		
	}

}
