package test240717.object2;

import java.util.Scanner;

public class LibraryMenu {
	LibraryController lc;
	Scanner sc;

	public LibraryMenu() {
		super();
		this.lc = new LibraryController();
		this.sc = new Scanner(System.in); 
	}
	
	public void mainMenu() {
		String name;
		int age;
		char gender;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		lc.insertMember(new Member(name, age, gender));
		
		while(true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				Member m = lc.myInfo();
				//lc.myInfo()는 Member객체 m이므로 이 값을 받는 것도 반드시 Member타입의 변수로 받아줘야한다.
				//변수명은 같아도 되고 달라도 된다.11
				System.out.println(m);
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다. 다시입력해주세요.");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		this.printBookList(bList);
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] bookList = lc.searchBook(keyword);
		
		this.printBookList(bookList);
	}
	
	public void printBookList(Book[] bList) {
		for(int i=0; i < bList.length; i++) {
			if(bList[i] == null) {
				break;
			}
			System.out.println(i + "번 도서 : " +  bList[i].toString());
		}
	}
	
	public void rentBook() {
	    this.selectAll(); // 도서 목록 전체 출력

	    System.out.print("대여할 도서 번호 선택 : ");

	    // 숫자가 아닌 입력을 처리하기 위해 입력 값을 문자열로 받아 처리
	    String input = sc.next();
	    try {
	        int index = Integer.parseInt(input); // 입력 값을 숫자로 변환
	        int result = lc.rentBook(index); // 대여 처리 결과 반환

	        switch (result) {
	            case 0:
	                System.out.println("성공적으로 대여되었습니다.");
	                break;
	            case 1:
	                System.out.println("나이 제한으로 대여 불가능합니다.");
	                break;
	            case 2:
	                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
	                break;
	            default:
	                System.out.println("잘못된 입력입니다. 다시 시도해주세요."); // 여기서는 정수만 처리한다.
	        }
	    } catch (NumberFormatException e) {
	        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요."); // 숫자가 아닌 입력 처리
	        //이 예외처리를 안해주고 default만 써주면 숫자가 아닌값을 입력하면 그냥 프로그램이 종료되어 버린다.
	    }
	}

	
}
