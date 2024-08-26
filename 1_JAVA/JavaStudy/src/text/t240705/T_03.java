package text.t240705;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("3개의 수를 입력하세요 : ");
//		int a, b, c;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		
//		
//		if(a==b&& a==c) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}

		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력%d : ", i + 1);
			arr[i] = sc.nextInt();
		}

		if (arr[0] == arr[1] && arr[0] == arr[2]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
