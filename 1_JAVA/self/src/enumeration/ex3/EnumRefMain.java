package enumeration.ex3;

public class EnumRefMain {

	public static void main(String[] args) {
		System.out.println("class basic = " + Grade.basic.getClass());
		System.out.println("class gold = " + Grade.gold.getClass());
		System.out.println("class diamond = " + Grade.diamond.getClass());
		System.out.println();
		System.out.println("ref basic = " + refValue(Grade.basic));
		System.out.println("ref gold = " + refValue(Grade.gold));
		System.out.println("ref diamond = " + refValue(Grade.diamond));
	}

	private static String refValue(Object grade) {
			 return Integer.toHexString(System.identityHashCode(grade));
	}

}
