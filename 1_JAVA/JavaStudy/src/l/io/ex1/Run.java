package l.io.ex1;

import java.io.File;
import java.io.IOException;

public class Run {

	/*
	 * 간단하게 파일을 만들어보자
	 * java.io.File클래스를 가지고
	 */
	public static void main(String[] args) {

		//1. 경로 지정을 딱히 하지 않고 파일 생성하기 - 지금 작업중인 project에 파일이 생성됨.
		File f1 = new File("test.txt"); // 파일객체를 하나 만든 상태(실제 파일 x)
		
		//2. 존재하는 폴더에 파일 생성 - 지정한 경로에 파일이 생성됨.
		File f2 = new File("D:\\test2.txt");
		
		//3. 존재하지 않는 경로에 파일 생성
//		File f3 = new File("D:\\tmp\\test.txt");
		
		try {
			
			f1.createNewFile(); // createNewFile 메소드가 실행할 때 실제 파일이 만들어짐(컴퓨터입장에선 코드로 만들어서 내보낸 개념이기에 OUTPUT)
			
			f2.createNewFile();// createNewFile 메소드의 반환값은 true 또는 false
			
//			f3.createNewFile(); // 존재하지 않는 경로로 생성시 예외발생 -> IOException
			
			//3. 폴더 먼저 만들고 파일이 만들어지게 하는 방법
			File tmpFolder = new File("D:\\tmp");
			tmpFolder.mkdir();//mkdir 는 make directory 라는 의미.(폴더생성)
			
			File f3 = new File("D:\\tmp\\test.txt");
			f3.createNewFile();
			
			File f4 = new File("ttt.txt");
			//단순히 파일의 "경로 정보"를 담는 파일 객체(File 객체)만 생성.
			//해당 파일이 존재하는지 여부를 확인하거나 조작할 준비가 된 것뿐.
			//즉, 메모리 공간에 File 객체만 생성되고, 실제로 파일이 디스크에 생성되지 않는다.
			//반드시 createNewFile()을 해줘야 파일이 생성된다.
			
			//파일의 존재유무를 코드로 확인할 수 있다.
			System.out.println(f4.exists());
			System.out.println(f3.exists());
			
			//파일인지 확인하는 메소드
			System.out.println(f1.isFile()); 
			System.out.println(tmpFolder.isFile());
			
//------------------------------------------------------------------------------------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("파일상위폴더 : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
