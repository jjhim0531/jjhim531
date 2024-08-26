package java240712;

public class BookMain {
	public static void main(String[] args) {
		Book[] arr = new Book[3];
		arr[0] = new Book("자바의 정석", "남궁성", 30000, "도움출판", 0.1);
		arr[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		arr[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		for (Book s : arr) {
			System.out.println(s.getTitle()+", "+ s.getAuthor() + ", " + s.getPublisher()+", "+s.getPrice()+ "원, " + (int)(s.getDiscountRate()*100)+"% 할인");
			System.out.println("할인된 가격 : " + (int)((1-s.getDiscountRate())*s.getPrice())+"\n");
		}

	}
}
