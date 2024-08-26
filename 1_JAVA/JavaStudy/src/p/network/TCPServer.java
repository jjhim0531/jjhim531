package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		/*
		 * TCP - 서버, 클라이언트 간에 1:1 소켓통신 - 데이터를 교환하기에 앞서 서버, 클라이언트 연결이 되어야한다. (서버가 먼저 실행되어
		 * 클라이언트의 요청을 기다린다.)
		 */
		Scanner sc = new Scanner(System.in);

		BufferedReader br = null;
		PrintWriter pw = null;

		int port = 3000;
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("클라이언트 요청을 기다리고 있습니다.");

			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함.....");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			while (true) {
				String message = br.readLine();

				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);

				System.out.println("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();

				pw.println(sendMessage);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();

				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
