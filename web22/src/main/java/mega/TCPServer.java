package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 서버객체를 생성하자.
		ServerSocket server = new ServerSocket(9100); // 아무도 안쓸 것 같은 포트 넘버 넣어주기
		System.out.println("server start!!");
		int count = 0;
		while (true) {
			System.out.println("wait request!!");
			server.accept();
			System.out.println("클라이언트가 연결됨...!!" + ++count);
			if (count == 1000) {
				break;
			}
		}
		System.out.println("server closed!!");
//		server.close();
		
	}

}
