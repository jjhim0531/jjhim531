package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		/*
		try-with-resources는 자동으로 close() 호출!
		자원 누수 방지 → UDP는 자원 관리 중요! 
			try (자원 선언) {
			    // ✅ 자원을 사용하는 코드
			} catch (예외클래스 e) {
			    // ❌ 예외 처리
			}
		*/
		
		int port = 4000;
		//서버가 4000포트를 결합하여 요청을 받을 준비를 한다.
		//DatagramSocket은 UDP 통신을 위한 소켓!
		try (DatagramSocket dsoc = new DatagramSocket(port)){//포트와 결합
			
			//전송받은 데이터(클라이언트가 보낸 데이터)를 지정할 바이트배열
			byte[] data = new byte[60000];//최대 60KB까지 수신 가능
			/*
			 DatagramPacket은 데이터를 담을 byte[]가 없으면 생성 불가! 반드시 byte[]를 전달해줘야 함.
			 new DatagramPacket에 같이가 아니라 따로 뺴서 쓰는 걸 권장!
			 */
			
			//클라이언트로부터 받을 packet 객체 생성(데이터를 수신할 패킷)
			DatagramPacket dp = new DatagramPacket(data, data.length);
			//DatagramPacket: UDP는 데이터를 패킷 단위로 주고받음 → DatagramPacket 필수! 
			//data: byte[]로 받은 데이터를 패킷에 저장.
			//data.length: 최대 60KB까지 수신 가능! 
			System.out.println("데이터 받을 준비 완료");
			
			while(true) {
				//데이터 전송된 것 받아주기
				//receive(): 클라이언트가 보낼 때까지 대기 (블로킹 메소드).
				dsoc.receive(dp);
				//데이터가 도착하면 dp에 저장!

				//데이터확인
				System.out.println("클라이언트 ip : " + dp.getAddress());
				String message = new String(dp.getData(), "UTF-8");
				//수신한 byte 배열 반환 → UTF-8로 변환해 출력.
				//new String(바이트배열, 인코딩): 수신 데이터를 문자열로 변환!
				System.out.println("클라이언트가 보낸 내용 : " + message);
				
			}
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
