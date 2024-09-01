package enumeration.test;

import enumeration.ref2.Grade;


public class AuthGradeMain1 {

	public static void main(String[] args) {

		AuthGrade[] arr = AuthGrade.values();
		for (AuthGrade all : arr) {
			print(all);
		}

	}

	private static void print(AuthGrade all) {
		System.out.println(all.name() + " 등급의 번호: " + all.getLevel()+" / 설명 = "+ all.description);

	}

}
