package j.Interface.ex2;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return this.width * this.height;
	}
}
/*
 * 이 경우 기본 생성자가 없는 이유:
	Rectangle 객체를 생성하려면 
	width와 height를 반드시 전달해야 의미 있는 객체가 된다.
	기본 생성자가 있으면, 
	Rectangle r = new Rectangle();처럼 
	매개변수 없이 생성할 수 있는데, 
	이 상태로는 객체가 올바르게 초기화되지 않아 의미가 없다.
 
 */
/*
// 기본 생성자를 써준다면
public Rectangle() {
    this.width = 1.0; // 기본값
    this.height = 1.0; // 기본값
}
*/