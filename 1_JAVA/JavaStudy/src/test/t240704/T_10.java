package test.t240704;

import java.util.Scanner;

public class T_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[4][4];
		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.print( "\t");
			}
			System.out.println();
		}

	}

}
