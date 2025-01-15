package test240716.object1;

public class CircleController {
	private Circle c;

	public CircleController() {
		this.c = new Circle();
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double circum = Math.PI * c.getRadius() * 2;
		return "둘레 :" + c.toString() + " / " + circum;
		// 그냥 c만 써줘도 참조변수는 자동적으로 toString을 호출하기에 같은 결과가 나온다.
		// 그러나 보기 좋게 명시적으로 toString을 써준것이다.

	}

	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);

		double area = Math.PI * c.getRadius() * c.getRadius();
		return "면적 :" + c.toString() + " / " + area;
	}

}
