package enumeration.ex3;
public class EnumEx3_1 {
	public static void main(String[] args) {
		int price = 10000;
		
		DiscountService discountService = new DiscountService();
		
		int basic = discountService.discount(Grade.basic, price);
		int gold = discountService.discount(Grade.gold, price);
		int diamond = discountService.discount(Grade.diamond, price);
		
		System.out.println("basic 등급의 할인 금액: " + basic);
		System.out.println("gold 등급의 할인 금액: " + gold);
		System.out.println("diamond 등급의 할인 금액: " + diamond);
		
	}
}