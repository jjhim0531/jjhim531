package test240716.object1;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.height + " " + this.width;
	}
	
	/*
	// 면적 계산 메서드 추가
    public int calculateArea() {
        return this.width * this.height;
    }

    // 둘레 계산 메서드 추가
    public int calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
    */
}
