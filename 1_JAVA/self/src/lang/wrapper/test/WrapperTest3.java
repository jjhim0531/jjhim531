package lang.wrapper.test;

public class WrapperTest3 {
	public static void main(String[] args) {
		String str = "100";
		
		Integer intger1 = Integer.valueOf(str);
		System.out.println(intger1);
		
		int num = intger1.intValue();
		System.out.println(num);
		
		Integer integer2 = Integer.valueOf(num);
		System.out.println(integer2);

	}

}
