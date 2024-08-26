package lang.immutable.change;

public class Main2 {
	public static void main(String[] args) {
		ImmutablObj obj1 = new ImmutablObj(10);
		ImmutablObj obj2 = obj1.add(20);

		System.out.println(obj1.getValue());
		System.out.println(obj2.getValue());
	}

}
