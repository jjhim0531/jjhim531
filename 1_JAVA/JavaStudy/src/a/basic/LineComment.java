package a.basic;

class Solution {
	public int solution(int n) {

		int answer = 0;
		int n1 = 10;

		for (int i = 0; i <= n1; i++) {
			if (n1 % 2 == 0) {
				answer += i;

			}
		}
		return answer;
	}
}
