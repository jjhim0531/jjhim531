package java240719;

public class Run3 {
	public static void main(String[] args) {
		Book bk1 = new Book();
		bk1.displayInfo();
		Book bk2 = new Book("Hello Java", "Seo");
		bk2.displayInfo();
		Book bk3 = new Book("JPA 프로그래밍", "kim", 700);
		bk3.displayInfo();

	}

}

