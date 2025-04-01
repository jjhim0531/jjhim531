package q.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	/*
		서버가 실행되고, 클라이언트의 연결을 기다림. (accept())
		클라이언트가 연결되면, 서버에서 ServerReceive, ServerSend 두 개의 쓰레드를 실행.
		ServerReceive는 클라이언트가 보낸 데이터를 수신.
		ServerSend는 서버가 입력한 데이터를 클라이언트에게 전송.
	 */
//Run1
	public static void main(String[] args) {
		int port = 3000;
		
		try {
			ServerSocket soc = new ServerSocket(port);
			System.out.println("서버 연결준비 완료....");
			
			Socket socket = soc.accept();
			//accept() : 클라이언트의 연결 요청을 기다리고(블로킹 상태), 연결이 들어오면 해당 클라이언트와 통신할 수 있는 Socket을 반환하는 메서드.
			//이후 Socket을 사용해 클라이언트와 데이터를 주고받을 수 있음
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
			
			
			//클라이언트로부터 메세지를 받는 "쓰레드"를 실행하는 코드.
			ServerReceive receive = new ServerReceive(socket);
			Thread receiveTask = new Thread(receive);
			receiveTask.start();
			
			//클라이언트로부터 메세지를 보내는 쓰레드
			ServerSend send = new ServerSend(socket);
			Thread sendTask = new Thread(send);
			sendTask.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
