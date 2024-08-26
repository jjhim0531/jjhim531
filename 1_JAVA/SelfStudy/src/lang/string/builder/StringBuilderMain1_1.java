package lang.string.builder;

public class StringBuilderMain1_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		
		System.out.println(sb);
		
		sb.insert(4, "JAVA");
		System.out.println(sb);
		
		sb.delete(4, 8);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		
		//StringBuilder는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 안전한(불변) String 으로
		//변환하는 것이 좋다.
		String str = sb.toString();
		System.out.println(str);
	}

}
