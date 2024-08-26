package lang.immutable.test;

public class Main2 {
	public static void main(String[] args) {
		ImMyDate date1 = new ImMyDate(2024,1,1);
		ImMyDate date2 = date1;
		
		date1 = date1.withYear(2025);
		System.out.println(date1);
		System.out.println(date2);
	}

}
