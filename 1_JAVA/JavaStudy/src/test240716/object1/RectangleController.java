package test240716.object1;

public class RectangleController {
	private Rectangle r;

	public RectangleController() {
		this.r = new Rectangle();
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		
		int perimeter = 2 * (r.getWidth() + r.getHeight());
		//Rectangle 클래스의 calculatePerimeter 메서드 사용
	    //int perimeter = r.calculatePerimeter();
		//이렇게 함수호출로서 둘레를 구하는 것을 더 권장.
		//아니면 둘레가 필요한 곳마다 계속 식을 써줘야한다.
		return "둘레 : " + r.toString() + " / " + perimeter;
	}
	
	public String calcArea(int x, int y, int height, int width) {
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		
		int area = r.getWidth() * r.getHeight();
		//Rectangle 클래스의 calculateArea 메서드 사용
	    //int area = r.calculateArea();
		//이렇게 함수호출로서 면적을 구하는 것을 더 권장.
		//아니면 면적이 필요한 곳마다 계속 식을 써줘야한다.
		return "면적 : " + r.toString() + " / " + area;
	}
	
}
