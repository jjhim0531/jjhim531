package test240726.object1;
//StringTokenizer : 

//문자열을 특정 구분자(예: 공백, 콤마 등)로 분리하는 클래스(while 문을 사용하여 하나씩 가져와야 함)
//요즘엔 split()을 더 많이 사용(배열로 반환 후 바로 사용)
//토큰 : 
//문자열을 특정한 기준(구분자)으로 잘라서 만든 작은 조각(단어)들.

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}

	public String afterToken(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		String newStr = "";
		while (tokenizer.hasMoreTokens()) {// 토큰이 남아 있는지 확인(있으면 true, 없으면 false)
			newStr += tokenizer.nextToken();// 다음 토큰 가져오기 //공백을 제거하고 문자열 합치기
			// while문에서 hasMoreTokens()로 확인하지 않고 nextToken()을 계속 호출하면 NoSuchElementException
			// 발생)

		}

		return newStr;
	}

	public String firstCap(String input) {
		String str = "";
//		for(int i = 0; i < input.length(); i++) {
//			str += (i == 0 ? (input.charAt(i) + "").toUpperCase() : input.charAt(i)); // 0번째~
//		}

		str = input.substring(0, 1).toUpperCase() + input.substring(1);
		return str;
	}

	public int findChar(String input, char one) {
		int count = 0;
//		for(int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
		// toCharArray : 문자열을 문자 배열(char[])로 변환하는 기능을 하는 메서드(String 클래스에서 제공)
		for (char c : input.toCharArray()) { // 문자열을 문자 배열로 변환 후 반복
			if (c == one) { // 찾고자 하는 문자와 비교
				count++;
			}
		}

		return count;
	}
}
