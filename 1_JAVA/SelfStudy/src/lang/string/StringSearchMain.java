package lang.string;

public class StringSearchMain {
	public static void main(String[] args) {
		String str = "Hello, Java! Welcome to java world.";
		System.out.println(str.contains("Java"));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("java",10));
		System.out.println(str.lastIndexOf("java"));
	}
}


