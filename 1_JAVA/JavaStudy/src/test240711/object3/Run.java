package test240711.object3;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] arr = new Book[3];
		arr[0] = new Book();

		
		return;
		/*
		 우리는 도서관에서 책을 관리하는 프로그램을 만들려고 한다.
		 해당 클래스는 도서관에 책을 등록할 떄 사용하는 book객체를 생성할 Book클래스이다.
		 필요하다고 생각하는 데이터와 기능을 구현해보자.
		 
		 */
		

		//사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		//b1이라는 객체를 생성하고 생성된 객체의 toString메소드를 호출하여 모든 정보를 확인하자.
		String title, genre, author;
		int number;
		
		System.out.print("도서 제목 :");
		title = sc.next();
		System.out.print("도서 장르 :");
		genre = sc.next();
		System.out.print("도서 저자 :");
		author = sc.next();
		System.out.print("도서 번호 :");
		number = sc.nextInt();
		
		
		Book b1 = new Book();
		b1.toString();
		//switch - case 3:
		// 제목 : 아프니까 청춘이다  장르 : 에세이   저자 : 최지원  책번호 : 150
		//or 입력하신 제목의 책은 등록되어 있지 않습니다.
		if(b1 != null && Target.equals(b1.getTitle))
		

	}
}
