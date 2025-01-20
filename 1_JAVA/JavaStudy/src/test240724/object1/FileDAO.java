package test240724.object1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	//FileWriter는 기본적으로 덮어쓰기 모드(Overwrite mode)로 동작하는 것이 기본 동작
	//만약 파일이 존재하지 않으면 새로운 파일을 생성
	//new FileWriter("example.txt", true); - 덮어쓰지 않고 내용을 추가
	//false를 명시하면 덮어쓰기 (기본값)
	public void fileSave(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));){
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder res = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file));){
			//br.readLine()을 통해 읽은 한 줄을 str 변수에 저장.
			//(여기서 str에 저장해주지 않으면 while문 조건 안에서 홀수번쨰 줄을 읽고 그냥 버리게 됨 - 조건문과 내부에서 br.readLine()을 중복 호출하면 한 줄 건너뛰는 문제 발생.)
			//str 값이 null이 아닐 때만 StringBuilder에 추가.
			//파일의 모든 내용을 올바르게 res에 저장할 수 있음.
			String str = null;
			while((str = br.readLine()) != null) {
				//readLine()이 텍스트 라인을 읽고 개행 문자는 제외하고 반환 -> 따라서 append 뒤에 수동으로 추가.
				   res.append(str).append(System.lineSeparator());  // 개행 문자 추가
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return res;
	}
	
	public void fileEdit(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));){
			bw.write(s + System.lineSeparator());  // OS에 맞는 개행 문자 삽입

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
