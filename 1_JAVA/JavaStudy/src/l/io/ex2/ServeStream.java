package l.io.ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//텍스트(문자) 데이터 저장 - 단순 텍스트 저장 (로그, 설정 파일 등)	
public class ServeStream {
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상시켜주는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메소드 제공
	 * 			 데이터 전송 속도를 향상시켜준다.
	 * 		>> 외부매체와 직접적으로 연결되는 스트림이 아니다.(단독 사용불가!! -> 반드시 기반스트림과 함께 사용)
	 */
	
	
	// 프로그램 -> 파일(출력)
	public void fileSave() {
		//FileWriter : 파일을 직접적으로 연결해서 2byte 단위로 출력할 수 있는 기반스트림
		//BufferedWriter : 속도향상에 도움을 주는 보조스트림
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("l_buffer.txt"));){
			
//			//1. 기반스트림 생성
//			FileWriter fw = new FileWriter("l_buffer.txt");
//			
//			//2. 보조스트림 생성 시 기반스트림 객체를 전달하면서 생성
//			BufferedWriter bw = new BufferedWriter(fw);
			
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.");
			bw.newLine();//운영체제(OS)에 맞는 줄바꿈(개행) 문자를 자동으로 삽입
			bw.write("끝");
			bw.flush(); // 내용 즉시 출력(버퍼(임시 메모리)에 보관 중인 데이터를 즉시 파일에 기록하는 역할)
			/*
			 * BufferedWriter는 성능을 위해 데이터를 일정량 모은 후 한 번에 파일에 기록한다.
				즉, write()를 여러 번 호출해도 즉시 파일에 쓰이지 않고 버퍼(메모리)에 쌓였다가 일정 크기가 차면 한 번에 기록된다.
				하지만 flush()를 호출하면 즉시 버퍼를 비우고, 모든 데이터를 강제로 출력한다.
			 */
			
			bw.close();
			/*
			 * bw.flush();  // 데이터를 즉시 파일에 반영 (다음 write 가능)
			 * bw.close();  // 데이터를 반영하고, 스트림을 닫음 (더 이상 write 불가)
			 */
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//외부매체(파일) -> 프로그램
	public void fileRead() {
		//FileReader : 파일과 연결해서 2byte 단위로 데이터를 입력받을 수 있는 객체
		//BufferedReader : 한줄씩 읽어오는 기능을 주는 보조스트림
		
		try (BufferedReader br = new BufferedReader(new FileReader("l_buffer.txt"));){
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
			//readLine() - BufferedReader 클래스의 메서드로, 파일이나 입력 스트림에서 한 줄 단위로 데이터를 읽어올 때 사용
			//			 - 한번에 한줄씩 꺼내와서 읽어줌. 더 이상 읽을 내용이 없으면 null 반환.
			//			 - 줄바꿈(개행) 문자를 기준으로 읽으며, 한 줄을 읽고 개행 문자는 제외
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	//프로그램 -> 파일출력
	//객체(인스턴스) 저장 - 객체의 상태를 유지한 채 저장 및 복원(Product 객체를 직렬화하여 파일에 저장.)
	public void objectSave() {
		//출력할 데이터
		Product ph1 = new Product("아이폰1", 1000000);
		Product ph2 = new Product("아이폰2", 2000000);
		Product ph3 = new Product("아이폰3", 3000000);
		
		//FileOutputStream : 파일과 연결해서 1byte 단위로 출력할 수 있는 기반스트림
		//ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product1.txt"));){
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			//.writeObject : 객체를 바이트 스트림으로 변환하여 파일 또는 네트워크로 전송할 수 있도록 함.
			//Serializable 인터페이스 필수
			//특정 필드를 직렬화에서 제외하려면 transient 키워드를 사용

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//외부매체(파일) -> 프로그램
	public void objectRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product1.txt"));){
			while(true) {
				System.out.println(ois.readObject());
				//.readObject() - 바이트 스트림을 읽어서 객체로 복원하는 역할.
				//객체의 클래스 구조와 serialVersionUID가 일치해야 함.
			}
		} catch(EOFException e) {
			System.out.println("파일을 다 읽어서 더이상 읽을 것이 없음.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
