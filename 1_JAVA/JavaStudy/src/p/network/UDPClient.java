package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보낼메세지 : ");
		String msg = sc.nextLine();
		
		//InetAddress: 서버의 IP 주소를 저장할 객체.
		//InetAddress는 new로 직접 생성 불가! 반드시 getByName()을 사용해 생성해야 함! 
		//InetAddress inet = InetAddress.getByName("172.30.1.26");
		InetAddress inet;
		int port = 4000;// 서버의 포트 번호!
		
		//DatagramSocket: UDP 통신을 위한 소켓 생성.
		//UDP에서 패킷을 주고받기 위한 통로(문) 역할
		//DatagramSocket이 생성될 때 클라이언트의 IP + 포트 번호를 자동으로 설정
		//클라이언트의 IP는 직접 명시 X! DatagramSocket이 자동으로 할당.
		try (DatagramSocket dsoc = new DatagramSocket();){
			inet = InetAddress.getByName("172.30.1.26");//서버의 ip 주소를 넣어줘야한다.(getByName("서버 IP"))
			/*
			 * getByName():
				도메인명을 넣으면 → IP 주소 반환.(서버 IP가 변경돼도 코드 수정 불필요!)
				IP 주소를 넣으면 → 그대로 반환
			 */
		
			//전송할 데이터 생성 
			//DatagramPacket(전송할 데이터를 byte[]로 변환, 전송할 데이터의 길이, ip 정보를 담은 inetaddress 객체, 전송할 port)
			//DatagramPacket(패킷)은 데이터 + 서버 IP + 포트 번호 모두 저장!
			//UDP는 연결이 없으니 패킷이 필수!
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
			dsoc.send(dp);//서버로 데이터 전송 (연결 필요 없음)
			//연결 없이 패킷 단위로 전송 → 빠르지만 신뢰성 낮음! 
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
