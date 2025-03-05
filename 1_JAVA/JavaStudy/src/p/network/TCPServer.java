package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	/*
	 	TCP
	 	- 서버, 클라이언트간에 1:1 소켓통신
	 	- 데이터를 교환하기에 앞서 서버, 클라이언트 연결이 되어야한다.
	 		(서버가 먼저 실행되어 클라이언트의 요청을 기다린다.)
	 	- 신뢰성있는 데이터 전달 가능
	 	- TCP는 스트림으로 전송 → Socket 사용!
	 	
	 	socket
	 	- 프로세스 간의 통신을 담당
	 	- 클라이언트와 서버가 데이터를 주고받을 수 있는 통신의 끝단(End-point).
	 	- inputStream / ouputStream을 가지고 있다.(해당 스트림을 이용해서 입출력이 가능하다)
	 	- InetAddress는 Socket 내부에 포함되어 있음!
	 	
	 	ServerSocket
	 	- 포트와 연결되어 외부의 연결 요청을 기다림-> 요청이 들어오면 수락해준다.
	 	- 수락 -> 통신할 수 있는 socket 생성
	 	
	 >> ServerSocket을 이용해 클라이언트의 요청을 대기하고, Socket을 통해 데이터를 주고받는다.
	 */
	
	//서버용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		/*
		채팅 프로그램에서 PrintWriter는 서버가 클라이언트에게 응답을 보낼 때 사용됩니다.
		BufferedReader는 클라이언트가 보낸 메시지를 서버가 받는 역할을 합니다.
		 */
		
		// 1) 포트번호 지정(서버 측에서 몇번 포트로 통로를 열 것인가?)
		int port = 3000;
		
		try {
			// 2) ServerSocket 객체 생성시 포트와 결합(Bind)
			ServerSocket server = new ServerSocket(port);//여기서 BindException이 발생하면 "포트가 사용 중"이라는 뜻.			
			System.out.println("클라이언트 요청을 기다리고 있습니다.");
			
			// 3)요청을 기다렸다가 요청이 오면 -> 요청 수락 후 클라이언트와 통신할 수 있는 서버쪽 소켓객체 생성
			Socket socket = server.accept(); //클라이언트 요청 대기 및 수락
			//accept()를 호출하면 서버는 클라이언트의 연결 요청이 올 때까지 무기한 대기 상태(블로킹상태)에 들어감.
			//연결 요청이 오면 이를 수락하고 통신할 수 있는 Socket 객체를 반환.
			//accept()가 반환하는 Socket은 클라이언트와 데이터를 주고받기 위한 통신 채널.
			//이 Socket 객체로 inputStream과 outputStream을 통해 데이터를 송수신.
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함...");
			
			
			
			// 4) 클라이언트와 입출력 기반 스트림 생성(바이트스트림밖에 안됨)
			// 5) 보조스트림을 활용해서 성능 개선
			
			//입력용 스트림(클라이언트로부터 전달된 값을 한 줄 단위로 읽어들이기 위해서 입력용스트림 사용)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//socket.getInputStream(): 바이트 스트림 반환 (InputStream 타입).
			//InputStreamReader : 바이트 스트림(0과 1로 구성된 데이터)을 문자 스트림(유니코드)으로 변환!
			//BufferedReader : 데이터 입력시 readLine메소드 이용가능
			//readLine() - BufferedReader 클래스의 메서드
			
			//출력용 스트림
			pw = new PrintWriter(socket.getOutputStream(), true);//두 번째 인자는 `autoFlush` 옵션
			//PrintWriter - OutputStream의 보조 스트림.
			//print(), println(), printf()메소드를 가지고 있음.
			//autoFlush: true로 설정 시, println() 후 자동으로 flush().
			
			while(true) {
				String message = br.readLine(); //클라이언트로부터 메세지 수신(한줄씩 읽음)
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
				
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); //클라이언트에게 메세지 전송//줄바꿈 포함해서 전송
				pw.flush(); //현재 스트림에 있는 데이터를 강제로 내보내기(스트림 비우기)(버퍼비우기)
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();//출력스트림 닫기
				br.close();//입력 스트림 닫기 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
