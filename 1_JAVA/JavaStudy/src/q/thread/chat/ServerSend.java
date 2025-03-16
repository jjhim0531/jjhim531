package q.thread.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend implements Runnable{
	//run(3)
	private Socket socket;

	
	public ServerSend(Socket socket) {
		super();
		this.socket = socket;
	}


	@Override
	public void run() {
		 // 소켓의 출력 스트림을 통해 클라이언트에게 데이터를 보냄
		try(PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				String sendMessage = sc.nextLine();// 서버에서 입력한 메시지
				
				pw.println(sendMessage);  // 클라이언트에게 메시지 전송
				pw.flush(); //현재 스트림에 있는 데이터를 강제로 내보내기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
