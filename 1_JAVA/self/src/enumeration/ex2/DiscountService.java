package enumeration.ex2;

public class DiscountService {
	public int discount(ClassGrade cg, int price) {
		int discountPercent = 0;
		
		if (cg == ClassGrade.basic) {
			discountPercent = 10;
		} else if (cg == ClassGrade.gold) {
			discountPercent = 20;
		} else if (cg == ClassGrade.diamond) {
			discountPercent = 30;
		} else {
			System.out.println("할인없음");
		}
		return price * discountPercent / 100;
	}

}
