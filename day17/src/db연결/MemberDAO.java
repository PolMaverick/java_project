package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	// 자바에서 db 처리할 때는 DML 중심으로 클래스를 만든다.
	// db 연결할 때는 db를 단위로 연결한다.
	// db 연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다.
	// 테이블 (entity, 개체)
	// create (insert ~ into values)
	public int create(String id, String pw, String name, String tel) throws Exception {
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		// 2. 자바에서 db로 연결: 연결한 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/homeshopping";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. homeshopping db연결 성공!!!");
		
		// 3. sql문을 만든다.
		String sql = "insert into member values (?, ?, ?, ?)"; // id, pw, name, tel이 들어온다. 하지만 컴퓨터는 들어오는 순서를 모르기 때문에 코드를 해줘야 한다. PreoaredStatement 밑에
//		String sql = "delete from member where id = 'apple'";
		//PrepareStatement: sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 있으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c://temp/test.txt";
//		File file2 = new File(file);
		
		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송!!!");
		System.out.println("SQL문 수행 개수 " + result);
		return result;
		
	}
	public int update(String id, String tel) throws Exception { // string id, string tel 넣어주기
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		// 2. 자바에서 db로 연결: 연결한 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/homeshopping";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. homeshopping db연결 성공!!!");
		
		// 3. sql문을 만든다.
		String sql = "update member set tel = ? where memid = ?"; // public에서 넣어준 변수 수 많음 ?. " 없이
		//PrepareStatement: sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 있으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel); // public에 넣어준 변수 수만큼.
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c://temp/test.txt";
//		File file2 = new File(file);
		
		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송!!!");
		System.out.println(result);
		return result;
		
	}
	public int delete(String id) throws Exception { // string id 넣어주기
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		// 2. 자바에서 db로 연결: 연결한 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/homeshopping";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. homeshopping db연결 성공!!!");
		
		// 3. sql문을 만든다.
		String sql = "delete from member where memid = ?"; // public에서 넣어준 변수 수 많음 ?. " 없이
		//PrepareStatement: sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 있으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); // public에 넣어준 변수 수만큼.
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c://temp/test.txt";
//		File file2 = new File(file);
		
		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate(); // sql로 전송하는 함수
		System.out.println("4. sql문 전송!!!");
		System.out.println(result);
		return result;
		
	}
	public String[] read(String ssn) throws Exception { // string id 넣어주기
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		// 2. 자바에서 db로 연결: 연결한 주소 url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. vaccine_reserv db연결 성공!!!");
		
		// 3. sql문을 만든다.
		String sql = "select * from reservation where ssn = 1111111111111"; // public에서 넣어준 변수 수 많음 ?. " 없이
		// PrepareStatement: sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ssn); // public에 넣어준 변수 수만큼.
		System.out.println("3. sql문 생성 성공!!!");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c://temp/test.txt";
//		File file2 = new File(file);
		
		// 4. sql문을 mysql로 전송한다.
		ResultSet rs = ps.executeQuery(); // sql로 전송하는 함수
		System.out.println("4. sql문 전송!!!");
		System.out.println(rs.next());
		String[] result = new String[4];
						  // {"win", "win", "win", "win"}
		if (rs.next()) {
			//테이블에 검색결과가 있다는 이야기!
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
//			System.out.println(id2 + " " + pw + " " + name + " " + tel);
			result[0] = id2;
//			result[1] = pw;
			result[2] = name;
			result[3] = tel;
		}
		return result;
	}
}
