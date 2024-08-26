package test.t240704;

import java.util.Scanner;

public class T_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[4][4];
		int value = 1;

		/*
		 * int[][] arr = { 
		 * 				{1,2,3,4},
		 * 				{5,6,7,8},
		 * 				{9,10,11,12},
		 * 				{13,14,15,16}
		 * };
		 */

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = value++;

				System.out.print(arr[j][i] + "\t");
				//System.out.print("%4d", arr[j][i]);
			}
			System.out.println();
		}

	}

}
