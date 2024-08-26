package java240719;

public class Book {
	String title;
	String author;
	int page;

	public Book() {
		
		this(" ", " ", 0);
	}

	public Book(String title, String author) {
		this(title, author, 0);

	}

	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;

	}

	void displayInfo() {
		System.out.println("제목 : " + this.title + " / 저자 : " + this.author + " / 페이지 :" + this.page);
	}

}
