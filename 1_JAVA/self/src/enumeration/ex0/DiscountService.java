package enumeration.ex0;

public class DiscountService {
	public int discount(String grade, int price) {
		int discountPercent = 0;

		if (grade.equals("basic")) {
			discountPercent = 10;
		} else if (grade.equals("gold")) {
			discountPercent = 20;
		}  else if (grade.equals("diamond")) {
			discountPercent = 30;
		} else {
			System.out.println("할인없음");
		}
		return price * discountPercent / 100;
	}

}
