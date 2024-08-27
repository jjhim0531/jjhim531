package lang.wrapper;

public class AutoboxingMain1 {

	public static void main(String[] args) {
		int value = 7;
		Integer boxedValue = value;
		System.out.println(boxedValue);

		int unboxedValue = boxedValue;
		System.out.println(unboxedValue);

	}

}
