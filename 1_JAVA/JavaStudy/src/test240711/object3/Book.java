package test240711.object3;

public class Book {
	private String title;
	private String genre;
	private String name;
	private int num;

	public Book() {
		super();
	}

	public Book(String title, String genre, String name, int num) {
		super();
		this.title = title;
		this.genre = genre;
		this.name = name;
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void toString() {
		System.out.printf("제목은 %s 장르는 %s 저자는 %s 책번호는 %d", title, genre, name, num);

	}

}
