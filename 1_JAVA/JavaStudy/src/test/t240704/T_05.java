package test.t240704;

public class T_05 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		/*
		 * for (int i = 0; i < arr.length; i++) { arr[i] = i + 1;
		 * System.out.print(arr[i]+" "); }
		 */

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = (arr.length - 1); i >= 0; i--) {
			arr[9-i] = i + 1;//역순으로 출력일 뿐 배열순서는 위와 똑같음.
			System.out.print(arr[i] + " ");
		}

	}
}
