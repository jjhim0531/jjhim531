package h.inherit.ex2;

public class TV extends Product{
	private int inch;

	public TV() {
		super();
	}

	//Product를 상속하므로 Product의 매개변수들을 다 적어서 생성자를 작성해줘야한다.
	public TV(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "TV [inch=" + inch + "]";
	}
	
	public String information() {
		return super.information() + " 크기:" + this.inch + "인치"; 
	}
}
