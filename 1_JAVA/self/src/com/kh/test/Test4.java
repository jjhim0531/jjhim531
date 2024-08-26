package com.kh.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {
	public void output() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("test.txt", true));

			bw.write("안녕하세요");
			bw.write("반갑습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Test4 test = new Test4();
		test.output();

	}

}
