package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.vo.Book;

public class BookController {
	private List<Book> bookList = new ArrayList<>();
	//List 인터페이스에는 clone() 메서드가 정의되어 있지 않다.
	//clone() 메서드는 Object 클래스에서 제공하는 메서드


	  //생성자 (BookController 객체가 생성될 때 자동으로 실행됨)
	public BookController() {
		super();
		bookList.add(new Book("자바의 정석", "IT", "남궁성"));
		bookList.add(new Book("자바를 자바", "IT", "최지원"));
		bookList.add(new Book("열혈자바", "IT", "윤성우"));
		bookList.add(new Book("아프리카 청춘이다.", "여행", "김수민"));
		bookList.add(new Book("아프니까 청춘이다.", "에세이", "박민수"));
	}

	public List<Book> getBookList() {
		//깊은복사(원본과 완전히 독립시킴)
	    List<Book> clonedList = new ArrayList<>();
	    for (Book b : this.bookList) {
	        clonedList.add(new Book(b.getTitle(), b.getAuthor(), b.getGenre())); // 새로운 Book 객체 생성
	    }
	    return clonedList;
	}



	
	public boolean insertBook(Book b) {
		return bookList.add(b);
	}
	
	/**
	 * 
	 * @param title
	 * @return Book(제목이 일치하는 책이 있을 경우). null(없을경우)
	 */
	public Book searchBookByTitle(String title) {
		for(Book b : bookList) {
			if(b.getTitle().equals(title)) {
				return b;
			}
		}
		
		return null;
	}
	
	public boolean updateBook(Book oldBook, Book newBook) {
		int i = bookList.indexOf(oldBook); // 검색해온 책이 몇번째 인덱스에 존재하는지 반환
		Book b = bookList.set(i, newBook); // 찾은 인덱스위치 책을 새로운 책으로 수정한다.
		return b != null;
	}
	
	public boolean deleteBook(Book b) {
		return bookList.remove(b);
	}
	
	//keyword가 제목에 포함되어 있는 도서 목록 반환
	public List<Book> searchBook(String keyword){
		List<Book> searchBookList = new ArrayList<>();
		for(Book b : bookList) {
			if (b.containKeyword(keyword)) {
				searchBookList.add(b);
			}
		}
		
		return searchBookList;
	}
}