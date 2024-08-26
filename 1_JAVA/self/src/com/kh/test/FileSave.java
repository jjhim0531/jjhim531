package com.kh.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileSave {

	public void fileSave(String fileName) {

		Food food = new Food("사과", 20);

		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

			objectOut.writeObject(food);

			System.out.println("Food 객체가 파일에 성공적으로 저장되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileSave fileSave = new FileSave();
		fileSave.fileSave("foodData.dat");
	}
}