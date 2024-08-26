package lang.string.test;

public class TestString11 {
	public static void main(String[] args) {
		String str = "Hello Java";

		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
		String strr= rev.toString();
		System.out.println(strr);
	}

}
