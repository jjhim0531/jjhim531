package enumeration.ex1;

public class DiscountService {
	public int discount(String grade, int price) {
		int discountPercent = 0;
		
		if (grade.equals(StringGrade.bs)) {
			discountPercent=10;

		}else if(grade.equals(StringGrade.gd)) {
			discountPercent=20;

		}else if(grade.equals(StringGrade.dia)) {
			discountPercent=30;

		}else {
			System.out.println("할인없음");
		}
		return price*discountPercent/100;
	}

}
