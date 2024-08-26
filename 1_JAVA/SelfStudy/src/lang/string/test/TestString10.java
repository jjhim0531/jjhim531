package lang.string.test;

public class TestString10 {
	public static void main(String[] args) {
		String fruits = "apple,banana,mango";
		String[] parts = fruits.split(",");

		for (String s : parts) {
			System.out.println(s);
		}
		String joinf = String.join("->", parts);
		System.out.println(joinf);

	}

}
