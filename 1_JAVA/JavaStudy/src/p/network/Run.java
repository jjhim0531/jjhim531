package p.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 	네트워크 : 여러대의 컴퓨터들이 연결되어있는 통신망
 			=> 네트워크를 통해서 서로 데이터를 교환하기 위함
 			
 	IP주소 : 네트워크 상에서 각 컴퓨터들을 식별해줄 수 있는 번호(실제 주소와 동일한 역할을 한다고 생각하면 된다.)
 			네트워크 어댑터(랜카드)마다 할당되어 있음.
 			
 	포트(Port) : 같은 컴퓨터 내에서 프로그램을 식별하는 번호.(어떤 주소지에 도착하더라도 어떤 방 문을 열지 알아야함.)
 				
 				
 	<서버와 클라이언트>
 	* 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램 또는 컴퓨터 (요청에 대해서 응답해주는 것)
 	* 클라이언트 : 서버에 요청을 하는 컴퓨터(서비스를 제공받는 고객)
 	
 	- 클라이언트는 서버에 요청 시 요청하고자 하는 서버의 'IP주소(또는 도메인), 포트번호'를 모두 알아야함
 	
 	* 현재 구동 중인 서버가 있을 때
 	  클라이언트는 그 서버로 요청을 보낼 수 있음 -> 응답결과가 돌아옴
 	  
 	  -요청과 응답에 의해서 웹은 작동한다.("통신한다")
 	  
 	  -웹에서의 통신방식은 'HTTP 프로토콜'을 사용한다.(자바에서는 사용 불가능! 웹에서만 가능!\)
 	  
 	  * 자바만 가지고 서버와 클라이언트의 간단한 통신을 해보자
 	   이때 데이터를 입출력하고자 한다면 서버와 클라이언트간에 스트림(통로)이 필요함
 	   
 	   소켓 프로그래밍(TCP / UDP)
 	   - 소켓 : 프로세스 간의 통신에 사용되는 양쪽 끝단.
 	   - TCP방식 : 데이터의 전송속도가 느려! 데이터가 정확하고 안정적으로 전달 가능.
 	   			 (신뢰성이 요구되는 프로그램)(연결지향(Connection-oriented)적 프로토콜 - 데이터 교환 전에 연결이 필요.)
 	   			  전송을 받을때까지 기다렸다가 받아야지만 완료가 됨. 
 	   			  잘 못 받았을 경우 역시 알 수 있음.
 	   			  TCP는 스트림으로 전송 → Socket 사용!
 	   			  
 	   - UDP방식 : 데이터의 전송속도가 빠름! 신뢰성이 없는 데이터 전달에 용이
 	   			 ( 예) 동영상 스트리밍 서비스)
 	   			 (데이터를 빠른 속도로 전송하고자할 때)(비연결 지향적 프로토콜)
 	   			  전송을 제대로 받았는지는 중요하지 않음. 
 	   			  잘 못 받았다해도 다음 데이터가 바로 전송됨.
 	   			  (동영상이 끊기더라도 다음 화면이 계속 나옴.)
 	   			  UDP는 패킷으로 전송 → DatagramSocket + DatagramPacket 사용! 
 */

// InetAddress : 네트워크 정보(ip 주소 관련)를 확인할 수 있는 클래스
public class Run {
	public static void main(String[] args) {
		
		try {
			//내 PC에 대한 정보를 반환(쉽게 말해 내 ip가 담겨있는 변수.)
			InetAddress localhost = InetAddress.getLocalHost(); 
			System.out.println("localhost : " + localhost); // 내 pc명 + 내 ip주소
			
			System.out.println("내 PC명 : " + localhost.getHostName()); // 호스트의 이름을 반환
			System.out.println("내 IP주소 : " + localhost.getHostAddress()); // 호스트의 IP주소를 반환
			
			System.out.println("================================================");
			
			//도메인 명을 통해서 해당 호스트의 정보를 가져올 수 있다.
			//단일 IP 주소 반환(사실 여러개여도 그중 1개만 반환.)
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			
			System.out.println("google 서버명 : " + googleHost.getHostName()); // google의 이름을 반환
			System.out.println("google IP주소 : " + googleHost.getHostAddress()); // google의 IP주소를 반환
			
			System.out.println("================================================");
			
			//다수의 IP 주소 반환
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버의 호스트 개수 " + naverHost.length);//4개의 서버에서 받아주고 있다는 의미.
			
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName()); // 네이버의 이름을 반환
				System.out.println("네이버 IP주소 : " + n.getHostAddress()+"\n"); // 네이버의 IP주소를 반환
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}

}
