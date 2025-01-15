package test240716.object1;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//부모 클래스에서 toString 메서드를 재정의하는 것은 가능하며, 자식 클래스에서도 추가적으로 오버라이딩하는 것이 가능하다.
	@Override
	public String toString() {
		return x + ", " + y;
	}
}
