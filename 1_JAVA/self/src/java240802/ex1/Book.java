package java240802.ex1;

public class Book extends Item {
	String author;
	String isbn;

	public Book(String name, int price, String author, String isbn) {
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("- 저자 : " + author + ", isbn : " + isbn);

	}

}
