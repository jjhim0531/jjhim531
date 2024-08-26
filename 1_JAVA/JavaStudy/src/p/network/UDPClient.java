package p.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("보낼 메세지 : ");
		String msg = sc.nextLine();

		InetAddress inet;
		int port = 4000;
		try {
			DatagramSocket dsoc = new DatagramSocket();
			inet = InetAddress.getByName("192.168.30.13");
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);

		} catch (SocketException e) {
			e.printStackTrace();

		}
	}

}
