package java240719;

public class Run {

	public static void main(String[] args) {
		Rectangle rc = new Rectangle();

		int area = rc.area();
		System.out.println("넓이 : " + area);

		int perimeter = rc.perimeter();
		System.out.println("둘레 : " + perimeter);

		boolean result = rc.isSquare();
		System.out.println("둘레 : " + result);
	}

}
