package test240716.object2;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		super();
	}
	//매개변수 생성자는 부모의 것까지 다 받을 수 있게 직접 수정해줘야한다.
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + number + " " + major;
	}
	
	
	
	
}
