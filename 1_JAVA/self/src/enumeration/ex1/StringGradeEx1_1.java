package enumeration.ex1;

public class StringGradeEx1_1 {

	public static void main(String[] args) {
		int price=10000;
		
		DiscountService ds = new DiscountService();
		
		int basic = ds.discount(StringGrade.bs,price);
		int gold = ds.discount(StringGrade.gd, price);
		int diamone = ds.discount(StringGrade.dia, price);
		
		System.out.println(basic);
		

	}

}
