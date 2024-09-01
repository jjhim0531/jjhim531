package enumeration.ex3;

public class DiscountService {
	public int discount(Grade grade, int price) {
		int discountPercent = 0;
		// enum switch 변경 가능
		if (grade == Grade.basic) {
			discountPercent = 10;
		} else if (grade == Grade.gold) {
			discountPercent = 20;
		} else if (grade == Grade.diamond) {
			discountPercent = 30;
		} else {
			System.out.println("할인X");
		}
		return price * discountPercent / 100;
	}
}