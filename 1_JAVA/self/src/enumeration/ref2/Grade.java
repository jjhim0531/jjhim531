package enumeration.ref2;

public enum Grade {

	// 상수 추가.
	BASIC(10), GOLD(20), DIAMOND(30), VIP(50);

	private final int discountPercent;

//열거형은 상수로 지정하는 것 외에 일반적인 방법으로 생성이 불가능하다. 따라서 생성자에 접근제어자를 선언할 필요가 없다. private이라고 생각하면 된다.
	Grade(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public int discount(int price) {
		return price * discountPercent / 100;
	}
}