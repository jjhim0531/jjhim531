package com.kh.test;

import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt");

			fw.write(97);
			fw.write(65);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Test3 test = new Test3();
		test.output();

	}

}
