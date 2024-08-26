package java240717;

public class productOrderMain {

	public static void main(String[] args) {
		ProductOrder[] items = new ProductOrder[3];

		ProductOrder tofu = new ProductOrder();
		ProductOrder kimchi = new ProductOrder();
		ProductOrder cola = new ProductOrder();

		tofu.productName = "두부";
		tofu.price = 2000;
		tofu.quantity = 2;
		items[0] = tofu;

		kimchi.productName = "김치";
		kimchi.price = 5000;
		kimchi.quantity = 1;
		items[1] = kimchi;

		cola.productName = "콜라";
		cola.price = 1500;
		cola.quantity = 2;
		items[2] = cola;

		int sum = 0;
		for (ProductOrder order : items) {
			System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
			sum += order.price * order.quantity;
		}
		System.out.println("총 결제금액 : " + sum);

	}

}
