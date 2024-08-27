package enumeration.ex0;

public class StringGradeMainEx0_1 {

	public static void main(String[] args) {
		int price = 10000;
		
		DiscountService ds = new DiscountService();
		
		int basic = ds.discount("basic", 10000);
		int gold = ds.discount("gold", 10000);
		int diamond = ds.discount("diamond", 10000);
		
		System.out.println(basic);
		System.out.println(gold);
		System.out.println(diamond);

	}

}
