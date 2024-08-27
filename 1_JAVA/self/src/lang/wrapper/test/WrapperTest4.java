package lang.wrapper.test;

public class WrapperTest4 {
	public static void main(String[] args) {
		String str = "100";

		Integer integer1 = Integer.valueOf(str);
		System.out.println(integer1);

		int num = integer1;
		System.out.println(num);

		Integer integer2 = num;
		System.out.println(integer2);

	}

}
