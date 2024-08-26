package lang.immutable.test;

public class Main {
	public static void main(String[] args) {

		MyDate date1 = new MyDate(2024,1,1);
		MyDate date2 = date1;
		
		System.out.println(date1);
		System.out.println(date2);
	}

}
