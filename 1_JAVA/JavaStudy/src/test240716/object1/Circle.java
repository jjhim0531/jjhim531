package test240716.object1;

public class Circle extends Point{
	private int radius;

	public Circle() {
		super();
	}

	//Point를 상속받으므로 Point의 x, y를 같이 적어줘야한다.
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + this.radius; 
	}
	//Circle에서 Point를 상속받으므로 super.toString을 써줌.
	//x, y는 Point클래스의 private변수이므로 Circle에서는 접근 불가능.
	
}
