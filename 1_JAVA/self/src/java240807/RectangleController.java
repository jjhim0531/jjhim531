package java240807;

public class RectangleController extends Point{
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		//면적 = 높이 * 너비
		int areaResult = r.getHeight()*r.getWidth();
		
		return "면적 " +r.toString()+" / "+areaResult;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		//둘레 = 2*(높이+너비)
		int periResult = 2* (r.getHeight()+r.getWidth());

		return "둘레 : " + r.toString() + " / "+ periResult;

	}
	
	
	

}
