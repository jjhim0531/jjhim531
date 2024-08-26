package test240711.object3;

import java.util.Scanner;

//사용자와의 소통
//입력을 받고 응답을 출력하는 것
public class Library {
	//필드영역에 만든 이유 : 앞으로 여러 군데서 쭉 쓰기 위해서.
}
	private Scanner sc = new Scanner(System.in);

	public void menu() {
	
	int menu = 0;
	while(menu !=9) {
		System.out.println("===========도서관리 프로그램============");
		System.out.println("1. 도서등록");
		System.out.println("2. 도서목록 출력");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택 : ");
		menu = sc.nextInt();
		sc.nextLine();
		switch(menu) {
		case1 : //도서목록
			break;
		}
		
	}

}
