package enumeration.ref2;

public class EnumRefMain2 {

	public static void main(String[] args) {
		int price = 10000;

		Grade[] arr = Grade.values();
		for (Grade all : arr) {
			printDiscount(all, price);
		}

	}

	private static void printDiscount(Grade grade, int price) {
		System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
	}

}
