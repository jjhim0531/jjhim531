package enumeration.ex2;

public class ClassGradeEx2_1 {

	public static void main(String[] args) {
		int price = 10000;
		 DiscountService ds = new DiscountService();
		 int basic = ds.discount(ClassGrade.basic, price);
		 int gold = ds.discount(ClassGrade.gold, price);
		 int diamond = ds.discount(ClassGrade.diamond, price);
		 System.out.println("BASIC 등급의 할인 금액: " + basic);
		 System.out.println("GOLD 등급의 할인 금액: " + gold);
		 System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

	}

}
