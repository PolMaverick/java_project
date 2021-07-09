package 클래스사용;

public class ReservationDB {
//	백신예약
//	1. 이름 등록 (create)
//	2. 주민번호 등록 (create)
//	3. 휴대폰번호 등록 (create)
//	4. 알림선택 등록 (create)
//	5. 의료기관 및 예약일시 등록 (create)
//	6. 예약대상 백신 검색(read)
//	7. 예약대상자 구분 검색(read)
//	8. 의료기관 및 예약일시 선택 (read) (create)
	
	String ip = "localhost"; //127.0.0.1
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "reservation";
	
	public void create() {
		System.out.println("백신예약");
	}

	public void read() {
		System.out.println("예약대상 백신");
		System.out.println("예약대상자 구분");
		System.out.println("의료기관찾기");
	}

}
