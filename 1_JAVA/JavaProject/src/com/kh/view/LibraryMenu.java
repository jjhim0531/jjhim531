package com.kh.view;

import java.util.List;
import java.util.Scanner;

import com.kh.controller.BookController;
import com.kh.controller.RentController;
import com.kh.vo.Book;
import com.kh.vo.Member;

//View : 사용자가 보게될 시각인 요소(화면) 출력및 입력
public class LibraryMenu {
	private Member loginUser;
	private Scanner sc;
	private BookController bc;
	private RentController rc;

	public LibraryMenu(Member loginUser, BookController bc, Scanner sc, RentController rc) {
		super();
		this.loginUser = loginUser;
		this.bc = bc;
		this.sc = sc;
		this.rc = rc;
	}

	/**
	 * 메인화면 : 가장 처음나타나는 화면으로 다양한 메뉴로 진입할 수 있다.
	 */
	public void menu() {

		while (true) {
			System.out.println("===============도서관리 메뉴=================");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서수정");
			System.out.println("3. 도서목록");
			System.out.println("4. 도서삭제");
			System.out.println("5. 도서검색");
			System.out.println("9. 프로그램종료");
			System.out.print("메뉴 입력 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				insertBook();
				break;
			case 2:
				updateBook();
				break;
			case 3:
				allPrintBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				searchBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다. 다시입력해주세요");
			}
		}
	}

	// 모든 책 목록을 출력해주기 위한 메소드 
	public void allPrintBook() {
	    System.out.println("===============전체 도서 목록==============");
	    List<Book> bList = bc.getBookList();

	    System.out.printf("%3s %7s %12s %5s\n", "No", "장 르", "제 목", "글쓴이"); 

	    // 일반 for문 사용하여 인덱스 추가
	    for (int i = 0; i < bList.size(); i++) {
	        System.out.printf("%3d ", (i + 1)); // 인덱스 출력 (1부터 시작)
	        bList.get(i).printInfo(); // 기존 출력 방식 유지
	    }
	}


	public void insertBook() {
		System.out.println("==================도서등록=====================");
		System.out.print("책제목 입력 : ");
		String title = sc.nextLine();

		System.out.print("저자 입력 : ");
		String author = sc.nextLine();

		System.out.print("장르 입력 : ");
		String genre = sc.nextLine();

		Book b = new Book(title, author, genre);
		if (bc.insertBook(b)) {
			System.out.println("책 등록 완료");
		} else {
			System.out.println("책 등록 실패");
		}

	}

	public void updateBook() {
	    System.out.println("==================도서수정=====================");
	    this.allPrintBook(); // 전체 도서 목록 출력

	    List<Book> bList = bc.getBookList();

	    while (true) {
	        System.out.print("수정하고 싶은 책 번호 입력 (1~" + bList.size() + ") : ");

	        int bookIndex;
	        try {
	            bookIndex = Integer.parseInt(sc.nextLine()); // 입력 값을 숫자로 변환 //Scanner로 입력받은 값은 기본적으로 String (문자열) 형태
	        } catch (NumberFormatException e) {
	            System.out.println("잘못 입력하였습니다. 숫자를 입력해주세요!");
	            continue;
	        }

	        if (bookIndex < 1 || bookIndex > bList.size()) { // 0도 잘못된 입력으로 처리
	            System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
	            continue;
	        }

	        // 사용자가 입력한 번호에 해당하는 책 가져오기
	        Book searchBook = bList.get(bookIndex - 1); // 리스트는 0부터 시작하므로 -1 해줌

	        // 책이 존재하는 경우 수정 진행
	        System.out.print("수정 후 책 제목 입력 : ");
	        String title = sc.nextLine();

	        System.out.print("수정 후 저자 입력 : ");
	        String author = sc.nextLine();

	        System.out.print("수정 후 장르 입력 : ");
	        String genre = sc.nextLine();

	        // 기존 Book 객체를 새로운 Book 객체로 변경
	        Book newBook = new Book(title, author, genre);
	        if (bc.updateBook(searchBook, newBook)) {
	            System.out.println("책 수정 성공");
	        } else {
	            System.out.println("책 수정 실패");
	        }
	        return;
	    }
	}

	
	public void deleteBook() {
		this.allPrintBook();

		System.out.print("삭제할 책제목 입력 : ");
		String title = sc.nextLine();

		Book b = bc.searchBookByTitle(title);

		if (b == null) {
			System.out.println("입력한 책을 찾을 수 없습니다.");
			return;
		}

		if (bc.deleteBook(b)) {
			System.out.println("정상적으로 삭제하였습니다.");
		} else {
			System.out.println("삭제에 실패하였습니다.");
		}
	}

	public void searchBook() {
		System.out.println("==================도서검색==================");
		System.out.print("검색할 키워드를 입력해주세요 : ");
		String keyword = sc.nextLine();

		List<Book> bookList = bc.searchBook(keyword);
		if (bookList.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		} else {
			System.out.println("============검색도서목록==============");
			System.out.printf("%7s %12s %5s\n", "장 르", "제 목", "글쓴이");
			for (Book b : bookList) {
				b.printInfo();
			}
		}
	}
}