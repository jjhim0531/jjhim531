package lang.string.builder;

public class StringBuilderMain1_2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A").append("B").append("C").append("D")

				.insert(4, "JAVA")

				.delete(4, 8)

				.reverse()

				// StringBuilder는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 안전한(불변) String 으로
				// 변환하는 것이 좋다.
				.toString();
		System.out.println(sb);
	}

}
