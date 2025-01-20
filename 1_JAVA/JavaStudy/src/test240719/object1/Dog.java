package test240719.object1;

public class Dog extends Animal{
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		super();
	}
	//자식 클래스의 매개변수가 있는 생성자에서는 반드시 부모 클래스의 생성자를 호출해야한다.
	//따라서, 부모 클래스의 매개변수를 모두 전달해야 합니다
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);// 부모 생성자 호출 - name, kind 초기화를 위해서. 
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getPlace() {
		return PLACE;
	}
	
	@Override
	public void speak() {
		String info = super.toString() + "몸무게는 " + weight + "kg입니다.\n";
		System.out.println(info);
	}
	
	
}
