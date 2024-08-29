package enumeration.ex2;

public class ClassRefMain {

	public static void main(String[] args) {
		System.out.println(ClassGrade.basic.getClass());
		System.out.println(ClassGrade.gold.getClass());
		System.out.println(ClassGrade.diamond.getClass());

		System.out.println(ClassGrade.basic);
		System.out.println(ClassGrade.gold);
		System.out.println(ClassGrade.diamond);
	}

}
