package java240807;

public class CircleController {
	private Circle c;

	public CircleController() {

		this.c = new Circle();
	}
	

	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		//면적 : 파이알제곱
		double areaResult = Math.PI * c.getRadius()*c.getRadius();
		return "면적 : " + c.toString()+" / " + areaResult;
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// 둘레 = 2*pi*r
		double circumResult = 2 * Math.PI * c.getRadius();

		return "둘레 : " +c.toString()+" / " + circumResult;

	}

}
