package q.thread.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive implements Runnable{
//run(4)
	private Socket socket;// 클라이언트와 연결된 소켓

	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;// 생성자를 통해 클라이언트 소켓을 받음
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
			//반복을 돌면서 버퍼에 새로운 메세지가 도착하면 받아서 출력
			while(true) {
				String message = br.readLine();// 클라이언트에서 메시지를 받음
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
