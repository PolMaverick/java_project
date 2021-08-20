package mega;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// 클라이언트 객체를 생성하자.
		// 클라이언트가 연결을 어디에 해야할지 모르니 ip(localhost)를 적어준다.
		// 돌리면 TCPClient.java 뿐 아니라 TCPServer.java에서도 연결된 것이 표시된다.
		// for 문으로 여러명 접속하는걸로
		for (int i = 0; i < 2000; i++) {
			Socket client = new Socket("localhost", 9100);
			System.out.println("client request ----" + (i + 1));
		}

	}

}
